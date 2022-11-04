package Onile_Exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student_Registration implements  ActionListener,FocusListener {

    JFrame frame;
    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11;

    JTextField t1, t2, t3, t4, t5;
    Container container;
    CheckboxGroup cbg;
    JComboBox j, j1, j2;
    Checkbox c1, c2;
    JButton b, b1, b2, b3;
    FileInputStream image;
    long password;
    boolean ba=true;
    boolean mobile=true;
    boolean Gmail=true;

    Student_Registration() {

        frame = new JFrame("Registration");
        frame.setFont(new Font("serif", Font.BOLD, 30));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBounds(400, 60, 500, 550);
        frame.setResizable(false);
        container = frame.getContentPane();
        container.setBackground(Color.darkGray);


        label1 = new JLabel("JAVA  PROGRAMING  QUEZE  REGISTRATION ");
        label1.setFont(new Font("serif", Font.BOLD, 17));
        label1.setForeground(Color.WHITE);
        label1.setBounds(65, 15, 400, 30);


        label2 = new JLabel("First Name :");
        label2.setFont(new Font("serif", Font.BOLD, 17));
        label2.setForeground(Color.WHITE);
        label2.setBounds(100, 60, 120, 30);

        t1 = new JTextField();
        t1.setBounds(220, 63, 200, 30);
        t1.setForeground(Color.blue);
        t1.setFont(new Font("sarif", Font.BOLD, 17));

        label3 = new JLabel("Last Name :");
        label3.setFont(new Font("serif", Font.BOLD, 17));
        label3.setForeground(Color.WHITE);
        label3.setBounds(105, 105, 120, 25);

        t2 = new JTextField();
        t2.setBounds(220, 103, 200, 30);
        t2.setForeground(Color.blue);
        t2.setFont(new Font("sarif", Font.BOLD, 17));

        label4 = new JLabel("College :");
        label4.setFont(new Font("serif", Font.BOLD, 17));
        label4.setForeground(Color.WHITE);
        label4.setBounds(123, 145, 140, 25);

        String se[] = {"TIT-Main", "TIT_Excellence", "TIT-Science", "TIT-CSE"};
        j2 = new JComboBox(se);
        j2.setBounds(220, 143, 200, 30);
        j2.setForeground(Color.darkGray);
        j2.setFont(new Font("sarif", Font.BOLD, 17));

        label5 = new JLabel("Branch :");
        label5.setFont(new Font("serif", Font.BOLD, 17));
        label5.setForeground(Color.WHITE);
        label5.setBounds(125, 185, 120, 25);

        String arr[] = {"CSE", "EX", "CIVIL", "MA"};
        j = new JComboBox(arr);
        j.setEditable(false);
        j.setBounds(220, 183, 200, 30);
        j.setFont(new Font("serif", Font.BOLD, 17));

        label6 = new JLabel("Semester :");
        label6.setFont(new Font("serif", Font.BOLD, 17));
        label6.setForeground(Color.WHITE);
        label6.setBounds(113, 225, 140, 25);

        String sem[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII"};
        j1 = new JComboBox(sem);
        j1.setBounds(220, 223, 200, 30);
        j1.setForeground(Color.darkGray);
        j1.setFont(new Font("sarif", Font.BOLD, 17));


        label7 = new JLabel("Enrollment No :");
        label7.setFont(new Font("serif", Font.BOLD, 17));
        label7.setForeground(Color.WHITE);
        label7.setBounds(70, 265, 140, 25);

        t3 = new JTextField();
        t3.setForeground(Color.blue);
        t3.setFont(new Font("sarif", Font.BOLD, 17));
        t3.setBounds(220, 263, 200, 30);


        label8 = new JLabel("Gmail :");
        label8.setFont(new Font("serif", Font.BOLD, 17));
        label8.setForeground(Color.WHITE);
        label8.setBounds(130, 305, 140, 25);

        t4 = new JTextField();
        t4.setBounds(220, 303, 200, 30);
        t4.setForeground(Color.blue);
        t4.setFont(new Font("sarif", Font.BOLD, 17));
        t4.addFocusListener(this);

        label9 = new JLabel("Mobile No :");
        label9.setFont(new Font("serif", Font.BOLD, 17));
        label9.setForeground(Color.WHITE);
        label9.setBounds(100, 345, 140, 25);


        t5 = new JTextField();
        t5.setBounds(220, 343, 200, 30);
        t5.setForeground(Color.blue);
        t5.setFont(new Font("sarif", Font.BOLD, 17));
        t5.addFocusListener(this);

        label10 = new JLabel(" Select your Photo :");
        label10.setFont(new Font("serif", Font.BOLD, 17));
        label10.setForeground(Color.WHITE);
        label10.setBounds(46, 383, 180, 25);


        b = new JButton("File");
        b.setFont(new Font("serif", Font.BOLD, 17));
        b.setForeground(Color.red);
        b.setBounds(220, 383, 200, 30);
        b.addActionListener(this);


        label11 = new JLabel(" Gender :");
        label11.setFont(new Font("serif", Font.BOLD, 17));
        label11.setForeground(Color.WHITE);
        label11.setBounds(122, 425, 180, 25);

        cbg = new CheckboxGroup();
        c1 = new Checkbox("Male", cbg, true);
        c1.setBounds(220, 425, 100, 30);
        c1.setForeground(Color.white);
        c1.setFont(new Font("serif", Font.BOLD, 17));

        c2 = new Checkbox("Female", cbg, false);
        c2.setBounds(340, 425, 100, 30);
        c2.setFont(new Font("serif", Font.BOLD, 17));
        c2.setForeground(Color.white);


        b1 = new JButton("Registration");
        b2 = new JButton("cancel");
        b3 = new JButton("Log In");
        b1.setFont(new Font("serif", Font.BOLD, 17));
        b1.setForeground(Color.RED);
        b1.setBounds(50, 465, 140, 25);

        b2.setFont(new Font("serif", Font.BOLD, 17));
        b2.setForeground(Color.RED);
        b2.setBounds(220, 465, 100, 25);

        b3.setFont(new Font("serif", Font.BOLD, 17));
        b3.setForeground(Color.RED);
        b3.setBounds(340, 465, 90, 25);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);


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
        container.add(c1);
        container.add(c2);
        container.add(label8);
        container.add(t5);
        container.add(label9);
        container.add(label10);
        container.add(b);
        container.add(b1);
        container.add(b2);
        container.add(b3);
        container.add(label11);
        frame.setVisible(true);
    }

    // File select from file system
    void imageInsert() {
        try {

            JFileChooser j = new JFileChooser();
            j.showOpenDialog(null);
            File file = j.getSelectedFile();
            image = new FileInputStream(file);
            JOptionPane.showMessageDialog(null, "Successfully select");
        } catch (Exception e) {
            ba=false;
        }
    }

    //Inter mobile number pattern right or wrong check
    public void MobileNumberCheck(String s) {
        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Matcher m = p.matcher(s);
        if (m.find() && m.group().equals(s)) {
            mobile=true;
            System.out.println("valid Mobile Number");
        } else {
            mobile=false;
            JOptionPane.showMessageDialog(null, "Enter right Mobile Number");
        }

    }

    //  Inter mobile number pattern right wrong check
    public void GmailCheck(String s) {
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_$]*(@gmail[.]com)+");
        Matcher m = p.matcher(s);
        if (m.matches() == false) {
          Gmail=false;
            JOptionPane.showMessageDialog(null, "Enter right Gmail");
        } else {
             Gmail=true;
            System.out.println("valid gmail ");
        }
    }

    // Password Ganrate Methode using Random class
    public void Randomm() {
        Random rm = new Random();
        password = rm.nextLong(99999999);
        String s = "         Registration successfully\n " +
                "     Login Password :" + password;
        JOptionPane.showMessageDialog(null, s, " Registration successfully", JOptionPane.PLAIN_MESSAGE);

    }

    //insert into database

    public void Into_databse() {
        try {
            Connection con = connection.connect();
            PreparedStatement p = con.prepareStatement("insert into Student_info (Enrollment," +
                    "FirstName,LastName ,college,Branch,semester,Gmail ,Mobile,photo,Gender ,password) values(?,?,?,?,?,?,?,?,?,?,?)");

            p.setString(1, t3.getText());
            p.setString(2, t1.getText());
            p.setString(3, t2.getText());
            p.setString(4, (String) j2.getSelectedItem());
            p.setString(5, (String) j.getSelectedItem());
            p.setString(6, (String) j1.getSelectedItem());
            p.setString(7, t4.getText());
            p.setString(8, t5.getText());
            p.setBinaryStream(9, image, image.available());
            p.setString(10, cbg.getSelectedCheckbox().getLabel());
            String s = Long.toString(password);
            p.setString(11, s);
            p.executeUpdate();


        } catch (Exception e) {
          ba=false;
            System.out.println(e);
        }

    }

// check all filed fill or not
    public void FiledCheck()
    {

        if(t1.getText().length()!=0&&t2.getText().length()!=0&&t2.getText().length()!=0&&
                t4.getText().length()!=0&&t5.getText().length()!=0)
        {
            System.out.println("All field fill");
            Randomm();
            Into_databse();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Fill all filed");
        }

    }






// Foucus Listener is used to check mobile number and gmail pattern right or wrong

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

        if (e.getSource() == t4) {
            GmailCheck(t4.getText());
        }
        if (e.getSource() == t5) {
            if(Gmail==true)
            MobileNumberCheck(t5.getText());
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {


      // b is used to insert image
        if (e.getSource() == b) {
            if(mobile==true)
            imageInsert();
        }


        //b1  is used to insert data into data base
        if (e.getSource() == b1) {
            if(ba==true) {
                FiledCheck();
            }
            else
            {
                String s="You Enter Duplicate Password or Gmail or Mobile No";
                JOptionPane.showMessageDialog(null,s);
            }

        }
        // b3 is used to log in student profile
        if (e.getSource() == b3) {
            new Student_login();
        }
        //b4 is used to exit program
        if (e.getSource() == b2) {
            System.exit(0);
        }
    }

}