/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.frame;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author wwwsh
 */
public class ConPro {
    static Connection con = null;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            con = DriverManager.getConnection(  "jdbc:mysql://localhost:3306/atmdata","root","root");  
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
}
