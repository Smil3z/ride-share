package code;
import fixitorrideit.Rideshare;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

//App class that has the main page
public class App {
    JFrame frame = new JFrame();
    private JPanel panelMain; private JLabel logo;private JButton RIDESHAREButton; private JButton MECHANICButton;
    private JButton RENTABIKEButton; private JButton AboutUsButton;
    private JButton signupButton;
    private Object App;
    private Object rideshareFinal;

    public App() {
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.add(panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // Action Listener for the Mechanic Button opens CarInfo form
        MECHANICButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==MECHANICButton){
                    CarInfo myCarInfo = new CarInfo();
                }
            }
        });

        signupButton.addActionListener(new ActionListener() {
            private Object signUp;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==signupButton){
                    signUp signUp = new signUp();
                    signUp.setVisible(true);
                }
            }
        });

        RIDESHAREButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== RIDESHAREButton){
                    Rideshare Rideshare = new Rideshare();
                    Rideshare.setVisible(true);
                }
            }
        });
    }
}