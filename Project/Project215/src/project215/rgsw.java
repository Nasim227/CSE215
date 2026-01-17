package project215;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Rgsw extends JFrame  {
    
    JFrame frame;
    JRadioButton r1 , r2 , r3 , r4 ;
    JButton b;
    JLabel l;
    
    
    public String [] studen = new String[100];
    public String [] facult = new String[100];
     
     public Rgsw(){
         
         Call c = new Call();
         
          l = new JLabel("Welcome");
         
          r1 = new JRadioButton("Faculty");
          r2 = new JRadioButton("Student");
        
        b = new JButton("Proceed..");
         
        ButtonGroup bg = new ButtonGroup();
        
        bg.add(r1);
        bg.add(r2);
        
        add(l);
        add(r1);
        add(r2);
        add(b);
        
        b.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent ae){
                
                if(r1.isSelected()){
                    
                    c.passing(true);
                    
                    new Call();
                    dispose();
                    
                }
                
                else if(r2.isSelected()){
                    
                     c.passing(false);
                    
                    new Call();
                    dispose();
                    
                }
                
                
            }
        });
        
       
        
        
        
        
        
        
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(1370,730);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}
     
}
