package project215;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Call extends JFrame {
    
    JFrame frame;
    JLabel l;
    JButton b;
    JRadioButton r1,r2;
    
    public Call(){
        
   
        l = new JLabel("Welcome");     
        b = new JButton("Submit");
        r1 = new JRadioButton("Register");
        r2 = new JRadioButton("Login");
    
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
    
        b.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent ae){
                
                if(r1.isSelected()){
                   
                    RegLog rglg1 = new RegLog( );
                    rglg1.Register( );
        
                    dispose();

                    
                }
                
                else if(r2.isSelected()){
                    
                    RegLog rglg = new RegLog( );
                    rglg.Login( );
        
                    dispose();
                    
                }
                    
                
            }
        });
    
    
    
    add(l);
    add(r1);
    add(r2);
    add(b);
    
    
        
    
    
    setVisible(true);
    setLayout(new FlowLayout());
    setSize(1370,730);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    public void passing(boolean prced){
         
         RegLog rglg3 = new RegLog();
         rglg3.passing(prced);
         
     }
    
}
