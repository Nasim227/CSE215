package project215;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class His extends JFrame {
    
    SubGrd s1 = new SubGrd();
    
    JFrame frame;
    JTextField t1 , t2 , t3;
    JLabel l1 , l2 , l3  ;
    JButton b;
    
    public String [] crde = new String[100];
    public String [] grads = new String[100];
    
    public His(String id){
        
        int j = 0 ;
        
        for( int i = 0 ; i < 100 ; i++ ){
                    
            if( s1.ied[i].equalsIgnoreCase(id)){
                
                this.crde[j] = s1.cde[i];
                this.grads[j] = s1.grad[i];
                
                j++;
                
            }
            
        }
        
        
        JFrame frame = new JFrame("History");
        
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        
        model.addColumn("Course Code");
        model.addColumn("Grade");
        
        int maxLength = Math.max(crde.length, grads.length);
        
        for (int i = 0; i < maxLength; i++) {
            String value1 = (i < crde.length) ? crde[i] : "";
            String value2 = (i < grads.length) ? grads[i] : "";
            model.addRow(new Object[]{value1, value2});
        }
        
        JScrollPane scrollPane = new JScrollPane(table);
        
        
        frame.getContentPane().add(scrollPane);
        
        
        
        
        
        
        
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(1370,730);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    
    
}
