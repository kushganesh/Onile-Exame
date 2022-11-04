package Onile_Exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;

public class Quez_start implements ActionListener {

    JFrame frame;
    Container container;
    Connection con;
    JLabel l,l1,label1;
    JRadioButton button[]=new JRadioButton[5];
    ButtonGroup bg;
    Timer time;
    JButton b1,b2,b3,b4,b5;
    int question_count=0;
    String check;
    String Enrollment;
    int  count=1;
    int number=0;

    Quez_start(String enrollment)
    {
        Enrollment=enrollment;
        Quez_start();
    }



   void Quez_start()
    {
        frame = new JFrame("Quez");
        frame.setFont(new Font("serif", Font.BOLD, 30));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBounds(400, 80, 700, 400);
        frame.setResizable(false);
        container = frame.getContentPane();
        container.setBackground(Color.darkGray);

        l=new JLabel();
        l.setFont(new Font("serif", Font.BOLD, 17));
        l.setForeground(Color.WHITE);
        l.setBounds(30,50,680,40);

        l1=new JLabel("Time Left :");
        l1.setFont(new Font("serif", Font.BOLD, 17));
        l1.setForeground(Color.WHITE);
        l1.setBounds(230,10,100,30);

        label1 = new JLabel("02:00");
        label1.setFont(new Font("serif", Font.BOLD, 20));
        label1.setForeground(Color.WHITE);
        label1.setBackground(Color.BLUE);
        label1.setBounds(330,10,100,30);


        bg=new ButtonGroup();
        int hr=70;int vr=70;
        for (int i=0;i<4;i++)
        {
            button[i]=new JRadioButton();
            container.add(button[i]);
            bg.add(button[i]);
            button[i].setFont(new Font("sarif",Font.BOLD,17));
            button[i].setForeground(Color.WHITE);
            button[i].setBackground(Color.darkGray);
            hr+=30;
            button[i].setBounds(vr,hr,300,25);
        }
        button[4]=new JRadioButton();
        bg.add(button[4]);
        container.add(button[4]);

        b1 = new JButton("PREVIOUS");
        b2 = new JButton("SUBMIT");
        b3 = new JButton("NEXT");
        b4 = new JButton("END EXAM");
        b5=new JButton("Logout");

        b1.setFont(new Font("serif", Font.BOLD, 17));
        b1.setForeground(Color.blue);
        b1.setBounds(50, 250, 120, 30);

        b2.setFont(new Font("serif", Font.BOLD, 17));
        b2.setForeground(Color.blue);
        b2.setBounds(200 ,250, 100, 30);

        b3.setFont(new Font("serif", Font.BOLD, 17));
        b3.setForeground(Color.blue);
        b3.setBounds(350, 250, 100, 30);

        b4.setFont(new Font("serif", Font.BOLD, 17));
        b4.setForeground(Color.RED);
        b4.setBounds(500, 250, 140, 30);

        b5.setFont(new Font("serif", Font.BOLD, 17));
        b5.setForeground(Color.RED);
        b5.setBounds(250, 300, 140, 30);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);



        container.add(l);
        container.add(b1);
        container.add(b2);
        container.add(b3);
        container.add(b4);
    //    container.add(b5);
        container.add(l1);
        container.add(label1);

        frame.setVisible(true);
        set();

    }
    public  void set() //set function is used to take questions from database
    {
        try {
            button[4].setSelected(true);

            con = connection.connect();
            PreparedStatement p = con.prepareStatement("select * from Quetions where count=?");
            p.setInt(1,count);
            ResultSet rs=p.executeQuery();

                while (rs.next())
                {
                    l.setText(rs.getString(2));
                    button[0].setText(rs.getString(3));
                    button[1].setText(rs.getString(4));
                    button[2].setText(rs.getString(5));
                    button[3].setText(rs.getString(6));


                    button[0].setActionCommand(rs.getString(3));
                    button[1].setActionCommand(rs.getString(4));
                    button[2].setActionCommand(rs.getString(5));
                    button[3].setActionCommand(rs.getString(6));
                    check=rs.getString(7);

                }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        /*
            1. b1 button is used to show previous question
            2. JButton function is used to enable all option if that  question is submitted
            3.enable function is used  disable previous button if count value is 1.

         */
        if(b1==e.getSource())
        {
            count--;
            set();
            enable(count);
            Jbutton();
        }

        // b2 button is used to submit selected option
        if(b2==e.getSource()) {

            Jbutton();
        }


         /*
            1. b3 button is used to show next question
            2. JButton function is used to enable all option if that  question is submitted
            3.enable function is used  disable previous button if count value is 1.

         */
        if(b3==e.getSource())
        {
            count++;
            set();
            enable(count);
            Jbutton();

        }

         //b4 button is used to end exam
        if(b4==e.getSource())
        {
            submit();

        }

        if(b5==e.getSource())
        {
            System.exit(0);
        }
    }


    // function is used to Enable or Disable button previous and next
    void enable(int p)
    {
        if(p==1)
        {
            b1.setEnabled(false);
        }
        else if(p==5)
        {
            b3.setEnabled(false);

        }
        else
        {
            b1.setEnabled(true);
            b3.setEnabled(true);
        }
    }

    // submit function is used to disable all button when student click end exam or automatically time over
    public void submit() {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        time.stop();

        JOptionPane.showMessageDialog(null,"your score is "+number);
        container.add(b5);
        b5.setVisible(true);
    }


/*
      1 Jbutton function is used to check selected option already selected or not
      2 first we check-> if rs.next show exception that means it is not answered
        show in catch block write code to insert into
 */


    public void Jbutton()
    {

        String p = bg.getSelection().getActionCommand();
//        System.out.println("selected "+p);
//        System.out.println("check "+check);
//        System.out.println("count "+count);
          Connection con=connection.connect();

        try
        {
            PreparedStatement pre=con.prepareStatement("select ans from Answer where Enrollment=?and count=?");
            pre.setString(1,Enrollment);
            pre.setInt(2,count);
            ResultSet rs=pre.executeQuery();

//            System.out.println("com    "+con);
//            System.out.println("pre   "+pre);
//            System.out.println("rs  "+rs);

              rs.next();
             System.out.println(rs.getString(1));

          //  JOptionPane.showMessageDialog(null,"you already submit");

            button[0].setEnabled(false);//if question already submitted than all button become disable
            button[1].setEnabled(false);
            button[2].setEnabled(false);
            button[3].setEnabled(false);


        }
        catch (Exception ee)
        {
            try {
                button[0].setEnabled(true);//if question not submitted than all button become enable
                button[1].setEnabled(true);
                button[2].setEnabled(true);
                button[3].setEnabled(true);

                if(p!=null) {
                    PreparedStatement pr = con.prepareStatement("insert into Answer(Enrollment,count,ans)values(?,?,?)");
                    pr.setString(1, Enrollment);
                    pr.setInt(2, count);
                    pr.setString(3, check);
                    pr.executeUpdate();


                    if (p.equals(check)) { // if selected option match right option than number value increase
                        number++;
                        System.out.println("number " + number);
                    }
                }
                System.out.println("B@"+ee);


            }
            catch (Exception eee )
            {
                System.out.println(eee);
            }
        }

    }

}

