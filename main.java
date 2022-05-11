
public class main {
    //static nur zum testen
    static int iFrage_ID;
    static String sFrage_Text ="Frage";
    static String sAntwort_1 = "A 1";
    static String sAntwort_2 = "A 2";
    static String sAntwort_3 = "A 3";
    static String sAntwort_4 = "A 4";

    int iRichtige_Antwort;

    //GUI Starten
    public static void main(String[] args)
    {

        mysql.maxID();
        System.out.println(iFrage_ID);
        mysql.select();
        gui.main(args);

    }





}


