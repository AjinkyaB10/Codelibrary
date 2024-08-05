package com.Backend.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/codelibrary";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Ajinkya@10";
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
