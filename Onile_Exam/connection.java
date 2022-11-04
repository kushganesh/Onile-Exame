package Onile_Exam;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Collection;

public class connection {
    static Connection con;

     public  static Connection connect()
     {
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Exam","root","");
           }
         catch (Exception e)
         {
             System.out.println(e);
         }

         return con;
     }

   }
