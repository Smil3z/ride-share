package code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// CarInfo class that has the car info page
public class CarInfo {
    private JPanel CarInfoPanel;private JButton nextButton; private JButton backButton;private JTextField textField1;
    private JTextField textField2; private JTextField textField3;private JLabel yearLabel; private JLabel Make;
    private JLabel Model; private JLabel VehicleInfo;
    JFrame frame = new JFrame();

    CarInfo(){
       frame.add(CarInfoPanel);
        //frame.setExtendedState(frame.MAXIMIZED_BOTH);
        //frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // Action Listener for the Next Button Opens up Mechanic form
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==nextButton){
                    frame.dispose();
                    Mechanic myMechanic = new Mechanic();
                }
            }
        });
        //action listener for back button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == backButton) {
                    frame.dispose();
                    App myApp = new App();
                }
            }

        });
    }


}
