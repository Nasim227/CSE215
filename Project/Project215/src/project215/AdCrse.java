package project215;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class AdCrse extends JFrame {
    
    File file1 = new File("id.txt");
    File file2 = new File("course.txt");
    
    public String [] ide = new String[100];
    public String [] cors = new String[100];
    
    JFrame frame;
    JTextField t1 , t2 , t3;
    JLabel l1 , l2 , l3  ;
    JButton b;
    
    
    public AdCrse(){
        
        
        RegLog r1 = new RegLog();
        String []list1 = r1.iden;
        
        JFrame frame = new JFrame("Add Course");
        JList<String> list = new JList<>(list1);
        
        JScrollPane scrollPane = new JScrollPane(list);
        
        frame.getContentPane().add(scrollPane);
        
        
        t1 = new JTextField(25);
        t2 = new JTextField(25);
        l1 = new JLabel("ID :");
        l2 = new JLabel("Course code :");
        b = new JButton("Add");
        
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        
        
        b.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent ae) {
                
                String id = t1.getText();
                String crscd = t2.getText();

                try (FileWriter fw = new FileWriter(file1, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter output = new PrintWriter(bw)) {
                    
                    output.println(id);
                }
                
                catch (IOException e) {
                    
                    JOptionPane.showMessageDialog(frame, "Error occurred while registering user: " + e.getMessage());
                }

                try (FileWriter fw = new FileWriter(file2, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter output = new PrintWriter(bw)) {
                    
                    output.println(crscd);
                }
                
                catch (IOException e){ 
                    
                    JOptionPane.showMessageDialog(frame, "Error occurred while registering user: " + e.getMessage());
                }
                
            }
            
        
        });    

        
        
        
        
        
        
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(1370,730);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    
    public void arry(){
        
        try{
            
            Scanner input = new Scanner(file1);
            
            int i = 0 ;
            
            while( input.hasNextLine()){
                
                this.ide[i] = input.nextLine();
                
                i++;
                
            }
            
            input.close();
            
        }
        
        catch(FileNotFoundException e){
            
            e.printStackTrace();
            
        }
        
        
        try{
            
            Scanner input = new Scanner(file2);
            
            int i = 0 ;
            
            while( input.hasNextLine()){
                
                this.cors[i] = input.nextLine();
                
                i++;
                
            }
            
            input.close();
            
        }
        
        catch(FileNotFoundException e){
            
            e.printStackTrace();
            
        }
    }
    
    
}
