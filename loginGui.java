import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginGui {

    main User = new main();
    private JButton button1;

    private JTextField textFieldUserName;

    private JLabel userName;

    private JLabel passwort;

    private JPasswordField passwordField1;
    private JPanel loginGui;


    public static void main(String[] args) {
        
        JFrame frameLog = new JFrame("loginGui");
        frameLog.setContentPane(new loginGui().loginGui);
        frameLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLog.pack();
        frameLog.setSize(300,400);
        //frameLog.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frameLog.setVisible(true);

    }


    public loginGui() {

        button1.setVisible(true);
        textFieldUserName.setVisible(true);
        userName.setVisible(true);
        passwort.setVisible(true);
        passwordField1.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                User.sUser_Name_Eingabe = textFieldUserName.getText();
                System.out.println(User.sUser_Name_Eingabe);
                User.sPasswort_Eingabe = passwordField1.getText();
                System.out.println(User.sPasswort_Eingabe);
                System.out.println("");
                Login.selectLogin();


            }
        });


    }
}