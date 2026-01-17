package project215;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Faculty extends JFrame {
    
    
    JFrame frame;
    JTextField t1 , t2 , t3;
    JLabel l1 , l2 , l3  ;
    JButton b;
    JRadioButton r1,r2,r3;
    
    
    public Faculty(){
        
        
        b = new JButton("Proceed");
        r1 = new JRadioButton("Add Course");
        r2 = new JRadioButton("See History");
        r3 = new JRadioButton("Submit Grade");
        
        JFrame frame = new JFrame("Faculty");
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        
        
        
        b.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent ae){
                
                if(r1.isSelected()){
                   
                    new AdCrse();
        
                    dispose();

                    
                }
                
                else if(r2.isSelected()){
                    
                    new History();
        
                    dispose();
                    
                }
                
                else if(r3.isSelected()){
                    
                    new SubGrd();
        
                    dispose();
                    
                }
                    
                
            }
        });
        
        
        
        
        add(r1);
        add(r2);
        add(r3);
        add(b);
        
        
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(1370,730);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
