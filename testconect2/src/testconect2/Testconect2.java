/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testconect2;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 98tae
 */
public class Testconect2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String SeverName = "DESKTOP-SIF0605";
       String UserName = "sa";
       String Password = "123456";
       String da = "QLDA";
       int Port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(UserName);
        ds.setPassword(Password);
        ds.setDatabaseName(da);
        ds.setServerName(SeverName);
        ds.setPortNumber(Port);
        String SQL = "Select * from DEAN  ";
        String SQL_SELECTNHANVIEN = "select * from NHANVIEN";
        
        try {
            Connection con = ds.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs1 = stmt.executeQuery(SQL_SELECTNHANVIEN);
            while (rs1.next() == true) {    
                String HONV = rs1.getString("HONV");
                String TENLOT = rs1.getString("TENLOT");
                String TENNV = rs1.getString("TENNV");
                int MANV = rs1.getInt("MANV");
                Date NGSINH = rs1.getDate("NGSINH");
                String DCHI = rs1.getString("DCHI");
                String PHAI = rs1.getString("PHAI");
                int LUONG = rs1.getInt("LUONG");
                int MA_NQL = rs1.getInt("MA_NQL");
                int PHG = rs1.getInt("PHG");

                System.out.println("HOVN : "+HONV+"|"+"TENLOT : "+TENLOT+"|"+"TENNV : "+TENNV+"|"+"NGSINH : "+NGSINH+"|"+"DCHI : "+DCHI+"|"+"PHAI : "+PHAI+"|"+"LUONG : "+LUONG+"|"+"MA_NQL : "+MA_NQL+"|"+"PHG : "+PHG);
                
            }
                con.close();
                stmt.close();
                rs1.close();
            
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
        
        
       
    }
    
}
