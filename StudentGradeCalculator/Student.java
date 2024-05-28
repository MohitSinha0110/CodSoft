package StudentGradeCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField stdname;
    private JTextField m1;
    private JTextField m2;
    private JTextField m3;
    private JTextField avg;
    private JTextField grade;
    private JButton calculateButton;
    private JTextField total;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int marks1,marks2,marks3,tot;
                double average;

                marks1 = Integer.parseInt(m1.getText());
                marks2 = Integer.parseInt(m1.getText());
                marks3 = Integer.parseInt(m1.getText());

                tot = marks1 + marks2 + marks3;

                total.setText(String.valueOf(tot));

                // calculate avg

                average = tot/3;

                avg.setText(String.valueOf(average));

                if(average>=90){
                    grade.setText("Grade A+");
                }
                else if (average<90 && average>=80){
                    grade.setText("Grade A");
                }
                else if (average<80 && average>=70){
                    grade.setText("Grade B");
                }
                else if (average<70 && average>=60){
                    grade.setText("Grade C");
                }
                else{
                    grade.setText("Less tha cutoff. ");
                }


            }
        });
    }
}
