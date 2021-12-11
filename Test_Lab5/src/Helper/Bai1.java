/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author 98tae
 */
public class Bai1 {
    public static void main(String[] args) {
        ketNoi("Lab5_SOF203");
    }
    
     public static Connection ketNoi(String databasename){
         
       Connection cn;
        try {
            String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = ("jdbc:sqlserver://localhost:1433;databaseName="+databasename);
            cn = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT * FROM HOCSINH";
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {                
                System.out.println("Ma SV : " + rs.getString(1) + " HoTen"+rs.getString(2) +" "+ rs.getString(3));
                
            }
            return cn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
