/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.sql.*;
/**
 *
 * @author simon
 */
public class MyConnection {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db","root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
    
}
