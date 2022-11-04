package Onile_Exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student_login implements ActionListener {

    JFrame frame;
    JLabel label1,label2,label,l1;
    JTextField field1,f1;
    JPasswordField passwordField;
    Container container;
    JButton button1,button2,button3;
    JDialog dialog;
       Connection com;
    PreparedStatement pr;
     String pas;

  Student_login()
    {
        frame =new JFrame("Student Login");
        frame.setFont(new Font("Aria",Font.PLAIN,30));
        frame.setLayout(null);

        frame.setIconImage(new ImageIcon().getImage());
        frame.setBounds(400,110,390,350);
        frame.setResizable(false);
        container=frame.getContentPane();
        container.setBackground(Color.darkGray);

        label=new JLabel(" Student Login Desk  ");
        label.setFont(new Font("Serif",Font.BOLD,20));
        label.setBounds(80,10,250,30);
        label.setForeground(Color.WHITE);


        label1=new JLabel("Name :");
        label1.setFont(new Font("Aria",Font.BOLD,18));
        label1.setBounds(85,63,120,20);
        label1.setForeground((Color.WHITE));

        field1=new JTextField();
        field1.setForeground(new Color(53, 53, 116));
        field1.setBounds(180,60,160,30);
        field1.setFont(new Font("Arial",Font.BOLD,18));



        l1=new JLabel("Enrollment No :");
        l1.setFont(new Font("Aria",Font.BOLD,18));
        l1.setBounds(10,112,140,20);
        l1.setForeground((Color.WHITE));

        f1=new JTextField();
        f1.setForeground(new Color(53, 53, 116));
        f1.setBounds(180,110,160,30);
        f1.setFont(new Font("Arial",Font.BOLD,18));



        label2=new JLabel("Password :");
        label2.setFont(new Font("Aria",Font.BOLD,18));
        label2.setBounds(51,163,120,20);
        label2.setForeground((Color.WHITE));

        passwordField=new JPasswordField();
        passwordField.setEchoChar('*');
        passwordField.setForeground(new Color(116, 53, 75));
        passwordField.setBounds(180,160,160,30);
        passwordField.setFont(new Font("Arial",Font.BOLD,28));

        button1=new JButton("Ragistration");
        button1.setForeground(Color.red);
        button1.setBounds(50,215,110,35);
       button1.addActionListener(this);

        button2=new JButton("Login");
        button2.setForeground(Color.red);
        button2.setBounds(180,215,80,35);
        button2.addActionListener(this);

        button3=new JButton("cancal");
        button3.setForeground(Color.red);
        button3.setBounds(270,215,80,35);
        button3.addActionListener(this);


        container.add(label1);
        container.add(label2);
        container.add(l1);
        container.add(field1);
        container.add(f1);
        container.add(passwordField);
        container.add(button1);
        container.add(button2);
        container.add(label);
        container.add(button3);

        frame.setVisible(true);
    }

    public void matchAccount()
    {

        try {
            String s1 = f1.getText();
            String s2 = String.valueOf(passwordField.getPassword());
            System.out.println(s2);
            System.out.println(s1);
            Connection con = connection.connect();
            PreparedStatement p = con.prepareStatement("select Enrollment,password from Student_exam.student_info where Enrollment=?");
            p.setString(1, s1);
            ResultSet r=p.executeQuery();
            r.next();
            String s3=r.getString(1);
            String s4=r.getString(2);

            if(s1.equals(s3)&&s2.equals(s4))
            {
                new Student_profile(s1);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Enter right Enrollment or password ");
                System.out.println("mmm");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
           // JOptionPane.showMessageDialog(null,"Enter right Enrollment or password ");
            JOptionPane.showMessageDialog(null,""+e);

        }
    }




    @Override
    public void actionPerformed(ActionEvent e) {
      if(button1==e.getSource())
      {
          new Student_Registration();
      }
      if(button2==e.getSource())
      {
          matchAccount();
      }
      if(button3==e.getSource())
      {
          System.exit(0);
      }

    }
//    public static void main(String[] args) {
//        Student_login student=new Student_login();
//    }
}
