import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui {

    main Frage = new main();
    private JButton FHButton;
    private JButton startB;
    private JTextField wilkommentext;
    private JPanel gui;
    private JTextField frageTextField;
    private JButton antwort4;
    private JButton antwort1;
    private JButton antwort2;
    private JButton antwort3;

    public static void main(String[] args) {
        JFrame frame = new JFrame("gui");
        frame.setContentPane(new gui().gui);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

    }
    public gui(){
        antwort1.setVisible(false);
        antwort2.setVisible(false);
        antwort3.setVisible(false);
        antwort4.setVisible(false);
        frageTextField.setVisible(false);

        startB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frageTextField.setVisible(true );
                startB.setVisible(false);
                FHButton.setVisible(false);
                antwort1.setVisible(true);
                antwort1.setText(Frage.sAntwort_1);
                antwort2.setVisible(true);
                antwort2.setText(Frage.sAntwort_2);
                antwort3.setVisible(true);
                antwort3.setText(Frage.sAntwort_3);
                antwort4.setVisible(true);
                antwort4.setText(Frage.sAntwort_4);
            }
        });
        antwort1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                antwort1.setText(Frage.sFrage_Text);
            }
        });
    }
}
