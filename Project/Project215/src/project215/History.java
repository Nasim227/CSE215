package project215;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class History extends JFrame {
    
    SubGrd s1 = new SubGrd();
    
    
    JFrame frame;
    JTextField t1 , t2 , t3;
    JLabel l1 , l2 , l3  ;
    JButton b;
    
    
    public History(){
        
        t1 = new JTextField(25);
        l1 = new JLabel("ID :");
        b = new JButton("Submit");
        
        
        add(l1);
        add(t1);
        add(b);
        
        
        
        b.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent ae) {
                
                String id = t1.getText();
                
                for( int i = 0 ; i < 100 ; i++ ){
                    
                    if( s1.ied[i].equalsIgnoreCase(id)){
                        
                        new His( id );
                        
                        dispose();
                        
                    }
                    
                }
                  
            }
        
        });
        
        
        
        
        
        
        
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(1370,730);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
    
    
    
}
