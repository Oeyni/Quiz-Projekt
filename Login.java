
import javax.print.DocFlavor;
import javax.swing.*;
import java.sql.*;
import java.util.Random;

public class Login {

    static String v1;
    static String v2;

    public static void selectLogin() {
        main User = new main();
        v1=User.sUser_Name_Eingabe;
        v2=User.sPasswort_Eingabe;
        String sqlSelectLogin = "SELECT * FROM benutzer WHERE User_Name LIKE '"+ v1 +"' AND Passwort LIKE '"+v2+"'";
        String conURL = "jdbc:mysql://localhost:3306/quiz_start";

        try (Connection conn = DriverManager.getConnection(conURL, "root", "");
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sqlSelectLogin)) {

             while (rs.next()){
                User.iUser_ID= rs.getInt(1);
                System.out.println(User.iUser_ID);
                User.sUser_Name=rs.getString(2);
                System.out.println(User.sUser_Name);
                User.sMail=rs.getString(3);
                System.out.println(User.sMail);
                User.sPasswort= rs.getString(4);
                System.out.println(User.sPasswort);
                User.sPasswort2= rs.getString(5);
                User.iHigh_Score= rs.getInt(6);
                System.out.println(User.iHigh_Score);
                User.sUser_Role=rs.getString(7);
                System.out.println(User.sUser_Role);



            }
            if(v1 != User.sUser_Name || v2==User.sPasswort){
                System.out.println("Falscher Benutzername oder Passwort!");
            }else {
                System.out.println("Login, Erfolgreich.");

            }


        } catch (SQLException ex) {

            throw new RuntimeException(ex);
        }


    }
}


