import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class gui extends JFrame{

    public gui(){
        //Name des JFrames
        setTitle("Quiz GUI");
        //Size JFrames
        setSize(300, 200);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        //Location mitte des Bildschirms
        setLocationRelativeTo(null);
        //Das beim Schließen des Fensters es auch tatsächlich geschlossen wird
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        //button_Quit, Button zum Beenden des Programm
        JButton button_Quit = new JButton("Quit");

        //Button unten Rechts setzen
        this.setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(button_Quit);
        this.add(buttonPanel, BorderLayout.SOUTH);



        /*
        * JPanel bottomRightPanel = new JPanel(new BorderLayout());
        * bottomRightPanel.add(button_Quit, BorderLayout.LINE_END);
        * JPanel mainPanel = new JPanel(new BorderLayout());
        * mainPanel.add(bottomRightPanel, BorderLayout.PAGE_END);
        */


        //Fügt die Funktion des Buttons hinzu, in dem Fall "Exit"
        button_Quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Beenden ohne Fehler
                System.exit(0);
            }
        });
        gl.setVerticalGroup(gl.createSequentialGroup().addComponent(button_Quit));
        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(button_Quit));

        //Bewegt den Button vom Rand des Fensters weg, und bleibt an der "selben" Stelle
        gl.setAutoCreateContainerGaps(true);
    }


    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                gui g = new gui();
                g.setVisible(true);
            }
        });
    }
}
