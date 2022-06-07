import javax.print.DocFlavor;
import java.sql.*;

public class mysql {


    //Methode um mit Datenbank zu verbinden
    public static void maxID(){
        main Frage = new main();
        String sqlSelectMaxFrageID="SELECT Max(Frage_ID) FROM fragen;";

        String conURL ="jdbc:mysql://localhost:3306/quiz_start";

        try(Connection conn = DriverManager.getConnection(conURL,"root","");
            Statement st= conn.createStatement();
            ResultSet rs1 = st.executeQuery(sqlSelectMaxFrageID)){


            if(rs1.next()){
                Frage.iFrage_ID=rs1.getInt(1);
                System.out.println(Frage.iFrage_ID);
            }


        }catch (SQLException e){

        }

    }
    public static void select(){

        main Frage = new main();

        String sqlSelectall ="SELECT * FROM fragen WHERE Frage_ID LIKE 3";
        String conURL ="jdbc:mysql://localhost:3306/quiz_start";

        try(Connection conn = DriverManager.getConnection(conURL,"root","");
            Statement st= conn.createStatement();
            ResultSet rs2= st.executeQuery(sqlSelectall)){

            while (rs2.next()){
                Frage.sFrage_Text=rs2.getString(2);
                System.out.println(Frage.sFrage_Text);
                Frage.sAntwort_1=rs2.getString(3);
                System.out.println(Frage.sAntwort_1);
                Frage.sAntwort_2=rs2.getString(4);
                System.out.println(Frage.sAntwort_2);
                Frage.sAntwort_3=rs2.getString(5);
                System.out.println(Frage.sAntwort_3);
                Frage.sAntwort_4=rs2.getString(6);
                System.out.println(Frage.sAntwort_4);
                Frage.iRichtige_Antwort=rs2.getInt(7);
                System.out.println(Frage.iRichtige_Antwort);
            }
        }catch (SQLException e){

    }


    }
}

