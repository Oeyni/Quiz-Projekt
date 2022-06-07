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

    private JLabel frageTextField2;

    private int antwort1wert = 1;
    private int antwort2wert = 2;
    private int antwort3wert = 3;
    private int antwort4wert = 4;

    public static void main(String[] args) {
        JFrame frame = new JFrame("gui");
        frame.setContentPane(new gui().gui);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

    }
    public gui() {
        antwort1.setVisible(false);
        antwort2.setVisible(false);
        antwort3.setVisible(false);
        antwort4.setVisible(false);
        frageTextField.setVisible(false);
        frageTextField2.setVisible(false);


            mysql.select();
            startB.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    frageTextField2.setVisible(true);
                    frageTextField2.setText(Frage.sFrage_Text);

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
                    if (antwort1wert == Frage.iRichtige_Antwort) {
                        antwort.richtig();
                    } else {
                        antwort.falsch();
                    }
                }
            });
            antwort2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (antwort2wert == Frage.iRichtige_Antwort) {
                        antwort.richtig();


                    } else {
                        antwort.falsch();


                    }
                }
            });
            antwort3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (antwort3wert == Frage.iRichtige_Antwort) {
                        antwort.richtig();
                    } else {
                        antwort.falsch();
                    }
                }
            });
            antwort4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (antwort4wert == Frage.iRichtige_Antwort) {
                        antwort.richtig();

                    } else {
                        antwort.falsch();

                    }
                }
            });

        }

    }


