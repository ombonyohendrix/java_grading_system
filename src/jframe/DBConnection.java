/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author win
 */
public class DBConnection {
    static Connection con = null;
    public static Connection getConnection(){
        try {
         Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3307/grading","root","");
        }catch (Exception e){
            e.printStackTrace();
        
        }
        
        return con;
    
    }
    
    
}