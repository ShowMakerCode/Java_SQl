/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testconecctione;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author 98tae
 */
public class Test_Connection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       isNotNumberScores("6.4");
    }
    
    
      public static boolean isNotNumberScores(String so) {
        String Number = so;
        String pattern ="[0-9]{1}[.]{0,1}[0-9]{0,1}";
        if (!Number.matches(pattern)) {
            System.out.println("1");
            return true;
        }
          if (Double.parseDouble(Number) < 0 | Double.parseDouble(Number) > 10) {
              System.out.println("2");
              return true;
          }
        
          System.out.println("0");

        return false;

    }
}
