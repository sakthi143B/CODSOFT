import javax.swing.*;
import java.awt.event.*;

public class MarksCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Marks Calculator");
        frame.setSize(400, 400);
        frame.setLayout(null);

        JLabel label = new JLabel("Enter marks for 3 subjects (out of 100):");
        label.setBounds(50, 20, 300, 30);
        frame.add(label);

        JTextField mark1 = new JTextField();
        mark1.setBounds(50, 60, 100, 30);
        frame.add(mark1);

        JTextField mark2 = new JTextField();
        mark2.setBounds(50, 100, 100, 30);
        frame.add(mark2);

        JTextField mark3 = new JTextField();
        mark3.setBounds(50, 140, 100, 30);
        frame.add(mark3);

        JButton calculateBtn = new JButton("Calculate");
        calculateBtn.setBounds(60, 200, 300, 40);
        frame.add(calculateBtn);

        calculateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double m1 = Double.parseDouble(mark1.getText());
                    double m2 = Double.parseDouble(mark2.getText());
                    double m3 = Double.parseDouble(mark3.getText());

                    double total = m1 + m2 + m3;
                    double average = total / 3;

                    String grade;
                    if (average >= 90) grade = "A+";
                    else if (average >= 80) grade = "A";
                    else if (average >= 70) grade = "B";
                    else if (average >= 60) grade = "C";
                    else if (average >= 50) grade = "D";
                    else grade = "F";

                    String result = "Total Marks: " + total + "/300\n"
                                  + "Average: " + String.format("%.2f", average) + "%\n"
                                  + "Grade: " + grade;

                    JOptionPane.showMessageDialog(frame, result, "Result", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numeric marks.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
