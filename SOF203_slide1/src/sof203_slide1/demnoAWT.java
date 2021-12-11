/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sof203_slide1;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author 98tae
 */
public class demnoAWT extends Frame{
    Button btnRed,btnYellow;
    Label lbResult;
    
    public demnoAWT(){
        setSize(400, 400);
        setTitle("demo");
        setLocationRelativeTo(this);
        setLayout(new FlowLayout());
        btnRed = new Button("red");
        btnYellow = new Button("Yellow");
        lbResult = new Label("Result");
        add(btnRed);
        add(btnYellow);
        add(lbResult);
        
        btnRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.red);
                lbResult.setText("red");
            
            }
        });
        
          btnYellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.YELLOW);
                lbResult.setText("YELLOW");
            
            }
        });
        
    
    }
    
}
