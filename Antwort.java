import javax.swing.*;

public class Antwort {

    public Antwort(){

    }

    public static void richtig(){
        JOptionPane.showMessageDialog(null,
                "Richtige Antwort",
                "PopUp Dialog",
                JOptionPane.INFORMATION_MESSAGE);
        Main.i = Main.i +1;



    }
    public static void falsch(){
        JOptionPane.showMessageDialog(null,
                "Flasche Antwort",
                "PopUp Dialog",
                JOptionPane.INFORMATION_MESSAGE);
        Main.i = Main.i +1;
    }
}
