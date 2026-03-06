package week17;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LibraryNotice {

    public static void main(String[] args) {
    
        JFrame frame = new JFrame();
        
        frame.setTitle("Library Notice");
        
        frame.setSize(400, 300);
        
        JLabel label = new JLabel("Library Opens at 7:00 AM", JLabel.CENTER);
        frame.add(label);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }
}
