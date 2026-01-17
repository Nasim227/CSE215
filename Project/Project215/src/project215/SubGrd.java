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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SubGrd extends JFrame {
    
    File file1 = new File("iden.txt");
    File file2 = new File("code.txt");
    File file3 = new File("grd.txt");
    
    public String [] ied = new String[100];
    public String [] cde = new String[100];
    public String [] grad = new String[100];
    
    
    JFrame frame;
    JTextField t1 , t2 , t3;
    JLabel l1 , l2 , l3  ;
    JButton b;
    
    
    public SubGrd(){
        
        t1 = new JTextField(25);
        t2 = new JTextField(25);
        t3 = new JTextField(25);
        l1 = new JLabel("ID :");
        l2 = new JLabel("Course code :");
        l3 = new JLabel("Grade :");
        b = new JButton("Submit");
        
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        
        
        
        b.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent ae) {
                
                String id = t1.getText();
                String crscd = t2.getText();
                String grde = t3.getText();

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
                
                try (FileWriter fw = new FileWriter(file3, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter output = new PrintWriter(bw)) {
                    
                    output.println(grde);
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
    
    
    public void arrs(){
        
        try{
            
            Scanner input = new Scanner(file1);
            
            int i = 0 ;
            
            while( input.hasNextLine()){
                
                this.ied[i] = input.nextLine();
                
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
                
                this.cde[i] = input.nextLine();
                
                i++;
                
            }
            
            input.close();
            
        }
        
        catch(FileNotFoundException e){
            
            e.printStackTrace();
            
        }
        
        
        try{
            
            Scanner input = new Scanner(file3);
            
            int i = 0 ;
            
            while( input.hasNextLine()){
                
                this.grad[i] = input.nextLine();
                
                i++;
                
            }
            
            input.close();
            
        }
        
        catch(FileNotFoundException e){
            
            e.printStackTrace();
            
        }
        
    }

    
    
}
