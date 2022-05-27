import java.sql.*;

public class insert {
    public static void main(String args[]){

        String url = "jdbc:mysql://localhost:3306/quiz";
        String username = "root";
        String password ="";

        Connection connection = null;
        Statement statement = null;
        try{
            /**
            try {
               Class.forName("com.mysql.jdbc.Driver");

           } catch (Exception e) {
               System.out.println(e);
            } */
            //Verbindung zur Datenbank
            connection = (Connection) DriverManager.getConnection(url, username, password);
            //Ausgabe, wenn Verbindung erfolgreich war
            System.out.println("Database connected!");
            //
            statement = (Statement) connection.createStatement();
            //Mysql Insert
            String sql = "INSERT INTO fragen (Frage_Text)"+"VALUES('Test69')";
            //Führt den Insert aus
            statement.executeUpdate(sql);
            //Ausgabe, wenn Insert Erfolgreich war
            System.out.println("Insert rdy");




        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(statement != null)
                    connection.close();
            }catch (SQLException se){

            }try {
                if(connection != null)
                    connection.close();
            }catch (SQLException se){
                se.printStackTrace();
            }
        }


    }
}
