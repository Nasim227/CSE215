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

public class Student extends JFrame {
    
    JFrame frame;
    JTextField t1 , t2 , t3;
    JLabel l1 , l2 , l3  ;
    JButton b;
    JRadioButton r1,r2,r3;
    
    public Student( String id ){
        
        b = new JButton("Proceed");
        r1 = new JRadioButton("Courses");
        r2 = new JRadioButton("See Grades");
        
        JFrame frame = new JFrame("Student");
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        
        
        b.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent ae){
                
                if(r1.isSelected()){
                   
                    new CrntCrse(id);
        
                    dispose();

                    
                }
                
                else if(r2.isSelected()){
                    
                    new His(id);
        
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
