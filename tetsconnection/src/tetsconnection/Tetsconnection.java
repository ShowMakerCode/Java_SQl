/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetsconnection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author 98tae
 */
public class Tetsconnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection cn;
        try {
            String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLDA";
            cn = DriverManager.getConnection(url, user, pass);
            if (cn!= null) {
                System.out.println("a");
                String sql = "Select * from CONGVIEC";
                Statement stm = cn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                while (rs.next()) {                    
                    System.out.print(rs.getString(1));
                    System.out.print(" "+rs.getString(2));
                    System.out.print(" "+rs.getString(3));
                    System.out.println("   \n ");
                   
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
