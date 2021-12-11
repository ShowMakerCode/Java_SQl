/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 98tae
 */
public class LHelper {
     public static Connection ketNoi(String databasename){
       Connection cn;
        try {
            String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = ("jdbc:sqlserver://localhost:1433;databaseName="+databasename);
            cn = DriverManager.getConnection(url, user, pass);
            return cn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
