package project215;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class CrntCrse extends JFrame {
    
    public String [] crse = new String[100];
    
    public CrntCrse( String id ){
        
        int j = 0 ;
        
        AdCrse r1 = new AdCrse();
        
        for( int i = 0 ; i < 100 ; i++ ){
                    
            if( r1.ide[i].equalsIgnoreCase(id)){
                
                this.crse[j] = r1.cors[i];
                
            }
        }
        
        
        JFrame frame = new JFrame("Add Course");
        JList<String> list = new JList<>(crse);
        
        JScrollPane scrollPane = new JScrollPane(list);
        
        frame.getContentPane().add(scrollPane);
        
    }
    
    
}
