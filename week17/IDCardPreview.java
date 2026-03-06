package week17;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class IDCardPreview {

    public static void main(String[] args) {

        JFrame frame = new JFrame("ID Card Preview");

        frame.setSize(400, 300);

        String text = "<html>"
                + "<h2>Student ID Card</h2>"
                + "Name: Shishir Mishra<br>"
                + "Module: Programming<br>"
                + "College: Islington College"
                + "</html>";

        JLabel label = new JLabel(text, SwingConstants.CENTER);

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
