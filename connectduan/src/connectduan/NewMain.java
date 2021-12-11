/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectduan;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author 98tae
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        iasNotNumberPhone("PH18761");
    }
    
    public static boolean iasNotNumberPhone(String txtValue){
         String Number =  txtValue;
         String pattern = "[PH,0-9]{2,10}";
         if (!Number.matches(pattern)) {
             System.out.println("1");
             return true;
        }
         System.out.println("0");
        return false;
    }
    
    
  public static boolean isNotNumberPhone(String txtValue){
        String Number =  String.valueOf(txtValue);
        String pattern = "^[a-zA-Z]\\w{2,}@\\w{2,}(\\.\\w{2,3}){1,2}$";
         if (Number.matches(pattern) == false ) {
            System.out.println("1");
            return true;
        }
      System.out.println("0");
    return false;
  
  
  }
   
   
   
       public static boolean isNotNumber(String txtValue) {
        String Number = String.valueOf(txtValue);
        String pattern = "[0-9]{1,2}";
        if (Number.matches(pattern) == false ) {
            System.out.println("1");
            return true;
        }
        
        if (Double.parseDouble(Number)<0 | Double.parseDouble(Number)>10) {
            System.out.println("2");
            return true;
        } 
        
        System.out.println("0");
        return false;

    }
    
}
