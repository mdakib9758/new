/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author akkii
 */
public class connection {
        Connection con=null;
        public static Connection connector()throws SQLException{
        try{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("driverloaded");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","akkii");
        //JOptionPane.showMessageDialog(null,"connection succesfull");
        return(con);
        
        }
        catch(ClassNotFoundException e){
            System.out.println("exception="+e.getMessage());
            return(null);
        }
        catch(SQLException e){
            System.out.println("Sql="+e.getMessage());
            return null;
        }
        }
}

