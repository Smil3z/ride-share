package code;
import javax.swing.*;
import java.util.ArrayList;
import java.util.ListIterator;
public class ShoppingCart {
    JFrame frame = new JFrame();
    private JPanel ShoppingCart;

    ShoppingCart(){
        frame.add(ShoppingCart);
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
