package week17;
import javax.swing.*;
import java.awt.*;

public class LoginWindow {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Window");
        frame.setSize(400, 300);
        frame.setLayout(null);
        
        JTextField usernameField = new JTextField();
        usernameField.setBounds(120, 80, 150, 30);
        frame.add(usernameField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 40);
        loginButton.setBackground(Color.GREEN);
        frame.add(loginButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }
}
