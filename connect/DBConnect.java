/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author NguyenDang
 */
public class DBConnect {
    
    public static Connection getConnecttion() {
        Connection cons = null;
        try {
            //System.out.println("Here");
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("Here2");
            cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicshop","root","1234abcd");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Khong the connect database");
        }
        return cons;
    }

    public static void main(String[] args) {
        System.out.println(getConnecttion());
    }

}
