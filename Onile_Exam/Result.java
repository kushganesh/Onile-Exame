package Onile_Exam;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;

public class Result {
    JFrame frame;
    JLabel label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13,label14;

    JTextField t1, t2, t3, t4, label1, t5;
    Container container;
    JTextArea a;
    JTextField j, j1, j2;
    JButton b, b1, b2;
    FileInputStream image;
    long password;
    String roll;




   Result() {

        frame = new JFrame("Student profile");
        frame.setFont(new Font("serif", Font.BOLD, 30));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBounds(200, 60, 750, 600);
        frame.setResizable(false);
        container = frame.getContentPane();
        container.setBackground(Color.darkGray);

        label1 = new JTextField("\s\s\s\s\s\s\s\s\s\s\s \s\s\s\s\s\s\s\s\s\s\s     Student \s\s Profile ");
        label1.setFont(new Font("serif", Font.BOLD, 20));
        label1.setForeground(Color.WHITE);
        label1.setBackground(Color.BLUE);
        label1.setBounds(180, 15, 450, 30);


        label2 = new JLabel("First Name :");
        label2.setFont(new Font("serif", Font.BOLD, 17));
        label2.setForeground(Color.WHITE);
        label2.setBounds(100, 60, 120, 30);

        t1 = new JTextField();
        t1.setBounds(220, 63, 200, 30);
        t1.setForeground(Color.blue);
        t1.setFont(new Font("sarif", Font.BOLD, 17));
        t1.setEditable(false);

        label14 = new JLabel();
        label14.setBounds(460, 60, 200, 180);
        label14.setBackground(Color.red);

        // 460, 60, 200, 180
        label3 = new JLabel("Last Name :");
        label3.setFont(new Font("serif", Font.BOLD, 17));
        label3.setForeground(Color.WHITE);
        label3.setBounds(105, 105, 120, 25);

        t2 = new JTextField();
        t2.setBounds(220, 103, 200, 30);
        t2.setForeground(Color.blue);
        t2.setFont(new Font("sarif", Font.BOLD, 17));
        t2.setEditable(false);

        label4 = new JLabel("College :");
        label4.setFont(new Font("serif", Font.BOLD, 17));
        label4.setForeground(Color.WHITE);
        label4.setBounds(123, 145, 140, 25);

        j = new JTextField();
        j.setBounds(220, 143, 200, 30);
        j.setForeground(Color.darkGray);
        j.setFont(new Font("sarif", Font.BOLD, 17));
        j.setEditable(false);

        label5 = new JLabel("Branch :");
        label5.setFont(new Font("serif", Font.BOLD, 17));
        label5.setForeground(Color.WHITE);
        label5.setBounds(125, 185, 120, 25);


        j1 = new JTextField();
        j1.setBounds(220, 183, 200, 30);
        j1.setFont(new Font("serif", Font.BOLD, 17));
        j1.setForeground(Color.darkGray);
        j1.setEditable(false);

        label6 = new JLabel("Semester :");
        label6.setFont(new Font("serif", Font.BOLD, 17));
        label6.setForeground(Color.WHITE);
        label6.setBounds(113, 225, 140, 25);

        j2 = new JTextField();
        j2.setBounds(220, 223, 200, 30);
        j2.setForeground(Color.darkGray);
        j2.setFont(new Font("sarif", Font.BOLD, 17));
        j2.setEditable(false);


        label7 = new JLabel("Enrollment No :");
        label7.setFont(new Font("serif", Font.BOLD, 17));
        label7.setForeground(Color.WHITE);
        label7.setBounds(70, 265, 140, 25);

        t3 = new JTextField();
        t3.setForeground(Color.blue);
        t3.setFont(new Font("sarif", Font.BOLD, 17));
        t3.setBounds(220, 263, 160, 30);
        t3.setEditable(false);


        label8 = new JLabel("Mobile No :");
        label8.setFont(new Font("serif", Font.BOLD, 17));
        label8.setForeground(Color.WHITE);
        label8.setBounds(100, 305, 140, 25);

        t4 = new JTextField();
        t4.setBounds(220, 303, 200, 30);
        t4.setForeground(Color.blue);
        t4.setFont(new Font("sarif", Font.BOLD, 17));
        t4.setEditable(false);
        //  t4.addFocusListener(this);

        label9 = new JLabel("Gmail :");
        label9.setFont(new Font("serif", Font.BOLD, 17));
        label9.setForeground(Color.WHITE);
        label9.setBounds(400, 263, 60, 25);


        t5 = new JTextField();
        t5.setBounds(470, 260, 190, 30);
        t5.setForeground(Color.blue);
        t5.setFont(new Font("sarif", Font.BOLD, 17));
        t5.setEditable(false);
        //  t5.addFocusListener(this);

        label10 = new JLabel(" Select any option :");
        label10.setFont(new Font("serif", Font.BOLD, 21));
        label10.setForeground(Color.RED);
        label10.setBounds(55, 363, 180, 25);


        label11 = new JLabel(" UPDATE PROFILE :");
        label11.setFont(new Font("serif", Font.BOLD, 17));
        label11.setForeground(Color.WHITE);
        label11.setBounds(116, 405, 180, 25);

        b = new JButton("click");
        b.setFont(new Font("serif", Font.BOLD, 17));
        b.setForeground(Color.red);
        b.setBounds(320, 400, 160, 35);


        label12 = new JLabel(" START EXAM :");
        label12.setFont(new Font("serif", Font.BOLD, 17));
        label12.setForeground(Color.WHITE);
        label12.setBounds(152, 450, 160, 30);

        b1 = new JButton("click");
        b1.setFont(new Font("serif", Font.BOLD, 17));
        b1.setForeground(Color.red);
        b1.setBounds(320, 450, 160, 35);

        label13 = new JLabel(" EXIT :");
        label13.setFont(new Font("serif", Font.BOLD, 17));
        label13.setForeground(Color.WHITE);
        label13.setBounds(217, 495, 160, 50);

        b2 = new JButton("click");
        b2.setFont(new Font("serif", Font.BOLD, 17));
        b2.setForeground(Color.red);
        b2.setBounds(320, 500, 160, 35);



        container.add(label1);
        container.add(t1);
        container.add(label2);
        container.add(t2);
        container.add(label3);
        container.add(t3);
        container.add(label4);
        container.add(label5);
        container.add(j);
        container.add(label6);
        container.add(j1);

        container.add(label7);
        container.add(j2);
        container.add(t4);
        container.add(t5);
        container.add(label8);
        container.add(t5);
        container.add(label9);
        container.add(label10);
        container.add(label11);
        container.add(label12);
        container.add(b);
        container.add(b1);
        container.add(label14);
        container.add(label13);
        container.add(b2);
        // container.add(a);
        frame.setVisible(true);
    }

//    public static void main(String[] args) {
//        Result s=new Result();
//    }

}
