/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;

/**
 *
 * @author 98tae
 */
public class jframe1 extends JFrame{
    Checkbox cb1,cb2,cb3;
    Label lb1,lb2;
    public  jframe1(){
        
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new FlowLayout());
        
        lb1 = new Label("Control in action : checkbook");
        cb1 = new Checkbox("Apple");
        cb2 = new Checkbox("Mango");
        cb3 = new Checkbox("Peer");
        lb2 = new Label("....................................");
        
        add(lb1);
        add(cb1);
        add(cb2);
        add(cb3);
        add(lb2);
        
        
        cb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
               lb2.setText("Apple Checkbox : " +(e.getStateChange() ==1 ? "Checked":"Unchecked"));
            }
        });
        
        cb2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
           lb2.setText("Mango Checkbox : " +(e.getStateChange() ==1 ? "Checked":"Unchecked"));
           
            }
        });
        
          cb3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
           lb2.setText("Peer Checkbox : " +(e.getStateChange() ==1 ? "Checked":"Unchecked"));
           
            }
        });
    
    }
    
}
