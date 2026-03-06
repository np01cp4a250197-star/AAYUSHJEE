package week17;

import javax.swing.*;
import java.awt.*;

public class IDCardWindow extends JFrame {

    public IDCardWindow(Student student) {

        setTitle("Student ID Card Preview");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new GridLayout(3, 1, 10, 10));

        JLabel idLabel = new JLabel("Student ID: " + student.getStudentId());
        JLabel nameLabel = new JLabel("Name: " + student.getName());
        JLabel courseLabel = new JLabel("Course: " + student.getCourse());

        add(idLabel);
        add(nameLabel);
        add(courseLabel);

        setVisible(true);
    }
}
