package Onile_Exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Collection;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Update_Profile implements ActionListener, FocusListener {


    JFrame frame;
    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9,label10,label11;

    JTextField t, t1, t2, t3, t4, t5;

    Container container;

    JComboBox j,j1,j2;
    Checkbox c1, c2;
    JButton b ,b1, b2, b3;

    FileInputStream image;
    long password;
    boolean Mobile=true;
    boolean Gmail=true;
     Update_Profile() {

        frame = new JFrame("Update Profile");
        frame.setFont(new Font("serif", Font.BOLD, 30));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBounds(400, 20, 500, 650);
        frame.setResizable(false);
        container = frame.getContentPane();
        container.setBackground(Color.darkGray);


         t = new JTextField("\s\s\s\s\s\s\s\s\s\s\s \s\s\s\s\s\s\s\s\s\s\s     Update \s\s Profile ");
         t.setFont(new Font("serif", Font.BOLD, 20));
         t.setForeground(Color.WHITE);
         t.setBackground(Color.BLUE );
         t.setBounds(50, 15, 400, 30);


          label1 = new JLabel("Enter your Enrollment No :");
          label1.setForeground(Color.WHITE);
          label1.setBounds(20, 73, 220, 25);
          label1.setFont(new Font("serif", Font.BOLD, 17));

          t1 = new JTextField();
          t1.setForeground(Color.blue);
          t1.setFont(new Font("sarif", Font.BOLD, 17));
          t1.setBounds(240, 70, 200, 30);




          label2 = new JLabel("Update  :");
          label2.setFont(new Font("serif", Font.BOLD, 21));
          label2.setForeground(Color.RED);
          label2.setBounds( 100, 110, 120, 30);


          label3 = new JLabel("First Name :");
          label3.setFont(new Font("serif", Font.BOLD, 17));
          label3.setForeground(Color.WHITE);
          label3.setBounds(116, 152, 120, 25);

          t2 = new JTextField();
          t2.setBounds(240, 150, 200, 30);
          t2.setForeground(Color.blue);
          t2.setFont(new Font("sarif", Font.BOLD, 17));

          label4 = new JLabel("Last Name :");
          label4.setFont(new Font("serif", Font.BOLD, 17));
          label4.setForeground(Color.WHITE);
          label4.setBounds(123, 195, 140, 25);

          t3 = new JTextField();
          t3.setBounds(240, 193, 200, 30);
          t3.setForeground(Color.blue);
          t3.setFont(new Font("sarif", Font.BOLD, 17));



          label5 = new JLabel("College :");
          label5.setFont(new Font("serif", Font.BOLD, 17));
          label5.setForeground(Color.WHITE);
          label5.setBounds(143, 233, 140, 25);

         String se[]={"TIT-Main","TIT_Excellence","TIT-Science","TIT-CSE"};
        j = new JComboBox(se);
        j.setBounds(240, 233, 200, 30);
        j.setForeground(Color.darkGray);
        j.setFont(new Font("sarif", Font.BOLD, 17));

        label6 = new JLabel("Branch :");
        label6.setFont(new Font("serif", Font.BOLD, 17));
        label6.setForeground(Color.WHITE);
        label6.setBounds(146, 275, 120, 25);

        String arr[]={"CSE","EX","CIVIL","MA"};
        j1=new JComboBox(arr);
        j1.setEditable(false);
        j1.setBounds(240, 273, 200, 30);
        j1.setFont(new Font("serif",Font.BOLD,17));

        label7 = new JLabel("Semester :");
        label7.setFont(new Font("serif", Font.BOLD, 17));
        label7.setForeground(Color.WHITE);
        label7.setBounds(131, 315, 140, 25);

        String sem[]={"I","II","III","IV","V","VI","VII","VIII"};
        j2 = new JComboBox(sem);
        j2.setBounds(240, 313, 200, 30);
        j2.setForeground(Color.darkGray);
        j2.setFont(new Font("sarif", Font.BOLD, 17));



        label8 = new JLabel("Gmail :");
        label8.setFont(new Font("serif", Font.BOLD, 17));
        label8.setForeground(Color.WHITE);
        label8.setBounds(149,  355, 140, 25);

        t4 = new JTextField();
        t4.setBounds(240, 353, 200, 30);
        t4.setForeground(Color.blue);
        t4.setFont(new Font("sarif", Font.BOLD, 17));
        t4.addFocusListener(this);


        label9 = new JLabel("Mobile No :");
        label9.setFont(new Font("serif", Font.BOLD, 17));
        label9.setForeground(Color.WHITE);
        label9.setBounds(120,  395, 140, 25);


        t5 = new JTextField();
        t5.setBounds(240, 393, 200, 30);
        t5.setForeground(Color.blue);
        t5.setFont(new Font("sarif", Font.BOLD, 17));
        t5.addFocusListener(this);



         label10 = new JLabel(" Upload your Photo :");
        label10.setFont(new Font("serif", Font.BOLD, 17));
        label10.setForeground(Color.WHITE);
        label10.setBounds(65, 434, 180, 25);


        b=new JButton("File");
        b.setFont(new Font("serif", Font.BOLD, 17));
        b.setForeground(Color.red);
        b.setBounds(240, 434, 200, 30);
        b.addActionListener(this);


        label11 = new JLabel("Update Password :");
        label11.setFont(new Font("serif", Font.BOLD, 17));
        label11.setForeground(Color.WHITE);
        label11.setBounds(75, 475, 180, 25);

          b1=new JButton("click");
          b1.setFont(new Font("serif", Font.BOLD, 17));
          b1.setForeground(Color.red);
          b1.setBounds(240, 474, 200, 30);





        b2 = new JButton("Update");
        b3 = new JButton("Back");

        b2.setFont(new Font("serif", Font.BOLD, 17));
        b2.setForeground(Color.RED);
        b2.setBounds(80, 520, 150, 30);

        b3.setFont(new Font("serif", Font.BOLD, 17));
        b3.setForeground(Color.RED);
        b3.setBounds(240, 520, 200, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        container.add(label1);
          container.add(t);

        container.add(label2);
          container.add(t1);

        container.add(label3);
          container.add(t2);

        container.add(label4);
          container.add(t3);

        container.add(label5);
          container.add(j);

        container.add(label6);
          container.add(j1);

        container.add(label7);
          container.add(j2);

        container.add(label8);
          container.add(t4);

        container.add(label9);
          container.add(t5);

        container.add(label10);
        container.add(b);

         container.add(label11);
          container.add(b1);

         container.add(b2);
         container.add(b3);

       frame.setVisible(true);
    }



    // File select from file system
    public  void   imageInsert()
    {
        try {

            JFileChooser j = new JFileChooser();
            j.showOpenDialog(null);
            File file = j.getSelectedFile();
            image = new FileInputStream(file);
            JOptionPane.showMessageDialog(null,"Successfully select");

        }
        catch (Exception e)
        {
            System.out.println(e);

        }
    }

    //Inter mobile number pattern right or wrong check
    public void MobileNumberCheck(String s)
    {
        Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Matcher m=p.matcher(s);
        if (m.find()&&m.group().equals(s))
        {    Mobile=true;
            System.out.println("valid");
        }
        else {
            Mobile=false;
            JOptionPane.showMessageDialog(null, "Enter right Mobile Number");
        }

    }

    //  Inter mobile number pattern right or wrong check
    public  void GmailCheck(String s)
    {
        Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_$]*(@gmail[.]com)+");
        Matcher m=p.matcher(s);
        if(m.matches()==false)
        {         Gmail=false;
            JOptionPane.showMessageDialog(null,"Enter right Gmail");
        }
        else
        {   Gmail=true;
            System.out.println("valid");
        }
    }

    // Password Ganrate Methode using Random class
    public void ramdom()
    {
        Random rm=new Random();
        password=rm.nextLong(99999999);
        String s= "         Updated Password :" +"\s\s\s\s\s"+ password;
        JOptionPane.showMessageDialog(null,s," Registration successfully",JOptionPane.PLAIN_MESSAGE);

    }




    @Override
    public void actionPerformed(ActionEvent e) {

// upload image
          if(b==e.getSource())
          {   if(Mobile==true)
              imageInsert();
          }

          // update password
          if(b1==e.getSource())
          {
              ramdom();
          }

          //conform update
          if(b2==e.getSource())
          {
            int a=  JOptionPane.showConfirmDialog(frame,"       \s\s\s\s  you want to update profile","Update Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);

            if(a==JOptionPane.YES_OPTION)
            {
                update();
                JOptionPane.showMessageDialog(null,"profile updated");
            }
//            if(a==JOptionPane.NO_OPTION)
//            {
//
//            }


          }


   // Back student profile
          if(b3==e.getSource())
          {
             new Student_profile(t1.getText());
          }
    }



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


public void update()
{
    try {
        Connection con=connection.connect();
        PreparedStatement p=con.prepareStatement("update student_info set FirstName =?,  LastName =?,   college =?, Branch=?,  semester =?,Gmail=? ,   Mobile=?,  photo=?,   password=? where Enrollment=?");
        p.setString(1,t1.getText());
        System.out.println(t1.getText());
        p.setString(2,t2.getText());
        System.out.println(t2.getText());
        p.setString(3,t3.getText());
        System.out.println(t3.getText());
        p.setString(4, (String) j.getSelectedItem());
        p.setString(5, (String) j1.getSelectedItem());
        p.setString(6, (String) j2.getSelectedItem());
        p.setString(7,t4.getText());
        System.out.println(t4.getText());
        p.setString(8,t5.getText());
        p.setBinaryStream(9,image,image.available());
        String pas= String.valueOf(password);
        p.setString(10,pas);
        p.executeUpdate();
        System.out.println("succfull7es");
    }
    catch (Exception e)
    {
        System.out.println(e);
    }



}

//    public static void main(String[] args) {
//
//        Update_Profile p=new Update_Profile();
//    }
}
