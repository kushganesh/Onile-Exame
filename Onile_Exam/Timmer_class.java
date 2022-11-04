package Onile_Exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.Timer;


public class Timmer_class extends Quez_start {



      int second;
      int minute;
      DecimalFormat decimalFormat;// used to formatting counter like 00:00
      String dsecond;
      String dminute;
   void   Timmer_class()
      {

          decimalFormat=new DecimalFormat("00");
          label1.setText("02:00");
          second=0;
          minute=2;
          timmer();
          time.start();
      }
      Timmer_class(String s)
      {
          super(s);
          Timmer_class();

      }

    public void timmer()
    {
        time=new Timer(1000, new ActionListener()   {
            @Override
            public void actionPerformed(ActionEvent e) {


                second--;

           //     System.out.println(second + " " + minute);
                if (second == -1) {
                    second = 59;
                    minute--;
                    dsecond = decimalFormat.format(second);
                    dminute = decimalFormat.format(minute);
                //    System.out.println(second + " " + minute);
                    label1.setText(dminute + ":" + dminute);


                }
                dsecond = decimalFormat.format(second);
                dminute = decimalFormat.format(minute);
                label1.setText(dminute + ":" + dsecond);
                if (minute == 0 && second == 0) {
                    time.stop();
                    JOptionPane.showMessageDialog(frame,"    Time is over \n auto submit","ganesh",JOptionPane.PLAIN_MESSAGE);
                   Timmer_class.super.submit();
                }
            }
            } );
        }

//    public static void main(String[] args) {
//        Timmer_class c=new Timmer_class("KKL");
//    }

}

