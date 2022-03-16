package code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// mechanic class has the mechanic page
public class Mechanic{
    private JPanel MechanicPanel;private JLabel Title;private JButton ShoppingCart; private JButton backButton;
    private JComboBox comboBox1;private JComboBox ComboBox;private JLabel AtHome; private JLabel AtShop;
    private JButton oil$5500Button; private JButton Oil;private JButton windshieldWiper$1499Button;
    private JButton WindShieldWipers;private JButton tire$10450Button; private JButton Tire;
    private JButton battery$10500Button; private JButton Battery;private JButton detailing$12000Button;
    private JButton Detailing;private JButton transmission$169900Button; private JButton clutch$86300Button;
    private JButton brake$45000Button; private JButton drivetrain$20000Button;private JButton fuelSystem$7500Button;
    private JButton exhaust$10200Button;private JButton cooling$9900Button; private JButton electrical$40000Button;
    private JButton engine$300000Button; private JButton suspension$21900Button;private JButton differential$49000Button;
    JFrame frame = new JFrame();


    Mechanic(){
        frame.add(MechanicPanel);
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==backButton) {
                    frame.dispose();
                    CarInfo myCar = new CarInfo();
                }
            }
        });

        ShoppingCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == ShoppingCart) {
                    frame.dispose();
                    ShoppingCart myCart = new ShoppingCart();
                }
            }});
    }

}
