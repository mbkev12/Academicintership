/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;



/**
 *
 * @author x18208746
 */
public final class DbUtil {
    
    private static String driver, url, user, password;

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private DbUtil() {
        
    }
    
    static {
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        driver = rb.getString("jdbc.driver");
        url = rb.getString("jdbc.url");
        user = rb.getString("jdbc.user");
        password = rb.getString("jdbc.password");
        
        
    }
    public static Connection getConnectio() throws ClassNotFoundException, SQLException { 
        Class.forName(driver);
        return DriverManager.getConnection(url, user, password);
    }
}
