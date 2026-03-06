package week17;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class StudentWindow extends JFrame {

    public StudentWindow() {
        setTitle("Student Profile");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StudentWindow();
            }
        });

    }
}
