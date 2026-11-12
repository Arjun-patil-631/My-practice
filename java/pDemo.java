import java.awt.FlowLayout;
import javax.swing.*;

public class pDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("CheckBox and RadioButton");

        JCheckBox c1 = new JCheckBox("Java");
        JCheckBox c2 = new JCheckBox("Python");

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        
        f.setLayout(new FlowLayout());
        bg.add(r1);
        bg.add(r2);


        f.add(c1);
        f.add(c2);
        f.add(r1);
        f.add(r2);

        f.setSize(300, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}