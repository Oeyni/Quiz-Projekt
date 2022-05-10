package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QUIZZANTRIEB {
    private JTextField wieVielIst1TextField;
    private JButton antwort1;
    private JButton antwort3;
    private JButton antwort2;
    private JPanel Panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("mainGUI");
        frame.setContentPane(new QUIZZANTRIEB().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public QUIZZANTRIEB (){
        antwort1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Gut gemacht die Antwort ist richtig :)",
                        "QUIZZANTRIEB",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        });
        antwort2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Leider ist die Antwort falsch",
                        "QUIZZANTRIEB",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        antwort3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Leider ist die Antwort falsch",
                        "QUIZZANTRIEB",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

}
