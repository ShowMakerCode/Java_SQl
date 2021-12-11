/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testconnectsql;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 98tae
 */
public class TestConnectSQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String NameSever = "DESKTOP-SIF0605";
        String dbName = "QLDA";
        int portNumber = 1433;
        String UserName = "sa";
        String Password = "123";
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(UserName);
        ds.setPassword(Password);
        ds.setDatabaseName(dbName);
        ds.setServerName(NameSever);
        ds.setPortNumber(portNumber);
        String sql = "Select*from CONGVIEC where MADA = 10";
        try {
            Connection conn = ds.getConnection();
             Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("MADA");
                int Stt = rs.getInt("STT");
                String Tencv  = rs.getString("TEN_CONG_VIEC");
                System.out.print("MADA :" +id +" "+"STT: " +Stt +" " +"TenCV : "+ Tencv + "\n");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLServerException ex) {
            Logger.getLogger(TestConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TestConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
       
        
    }
    
}
