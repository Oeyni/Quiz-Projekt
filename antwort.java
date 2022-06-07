import javax.swing.*;

public class antwort {

    public antwort(){

    }

    public static void richtig(){
        JOptionPane.showMessageDialog(null,
                "Richtige Antwort",
                "PopUp Dialog",
                JOptionPane.INFORMATION_MESSAGE);
                main.i = main.i +1;



    }
    public static void falsch(){
        JOptionPane.showMessageDialog(null,
                "Flasche Antwort",
                "PopUp Dialog",
                JOptionPane.INFORMATION_MESSAGE);
        main.i = main.i +1;
    }
}
