/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author l2pc203e
 */
public class LoginDAO {
     public boolean doSave(Login l){
    boolean ret=false;
        try {
             Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "apcl123456");
                PreparedStatement pstm = con.prepareStatement("insert into login values(?,?,?,?)");
                pstm.setInt(1, l.getId());
                pstm.setString(2, l.getName());
                pstm.setString(3, l.getEmail());
                pstm.setString(4, l.getPassword());
                int i=pstm.executeUpdate();
                if(i>0){
                    JOptionPane.showMessageDialog(null, "data Insert");
                    ret=true;
                }else{
                JOptionPane.showMessageDialog(null, "data not Insert");
                }
        } catch (Exception e) {
        }
    return ret;
    }
}
