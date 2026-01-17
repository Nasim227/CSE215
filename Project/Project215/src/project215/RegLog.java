package project215;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JFrame;

public class RegLog extends JFrame implements Info {
    
    private String namee;
    private String passs;
    
    
    public RegLog( ){
        
    }
    
    public void getNamee( String name ){
        
        this.namee = name;
        
    }
    
    
    public void getPasss( String pass ){
        
        this.passs = pass;
        
    }
    
    File file1 = new File("user.txt");
    File file2 = new File("pass.txt");
    File file3 = new File("name.txt");
    
    public String [] uname = new String[100];
    public String [] iden = new String[100];
    public String [] pas = new String[100];
    
    JFrame frame;
    JTextField t1 , t2 , t3;
    JLabel l1 , l2 , l3  ;
    JButton b;
    
    
    
    public void Register( ){
        
        t1 = new JTextField(32);
        t2 = new JTextField(32);
        t3 = new JTextField(32);
        l1 = new JLabel("ID/Initial : ");
        l2 = new JLabel("Password :");
        l3 = new JLabel("Name :");
        b = new JButton("Register");
        
                
        JFrame frame = new JFrame("Register..");
        
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
                String pass = t2.getText();
                String name = t3.getText();

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
                    
                    output.println(pass);
                }
                
                catch (IOException e){ 
                    
                    JOptionPane.showMessageDialog(frame, "Error occurred while registering user: " + e.getMessage());
                }

                try (FileWriter fw = new FileWriter(file3, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter output = new PrintWriter(bw)) {
                    
                    output.println(name);
                }
                
                catch (IOException e) {
                    
                    JOptionPane.showMessageDialog(frame, "Error occurred while registering user: " + e.getMessage());
            }
                
            arrs();

            Login();
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
                
                this.iden[i] = input.nextLine();
                
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
                
                this.pas[i] = input.nextLine();
                
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
                
                this.uname[i] = input.nextLine();
                
                i++;
                
            }
            
            input.close();
            
        }
        
        catch(FileNotFoundException e){
            
            e.printStackTrace();
            
        }
        
    }
     
    
     public void Login( ){
         
        t1 = new JTextField(25);
        t2 = new JTextField(25);
        l1 = new JLabel("ID/Initial : ");
        l2 = new JLabel("Password :");
        b = new JButton("Login");
        
        
        JFrame frame = new JFrame("Login..");
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        
        
         
        
        for( int i = 0 ; i < 100 ; i++ ){
            
            String id = t1.getText();
            String pass = t2.getText();
            
            if (iden[i].equals(id) && pas[i].equals(pass)) {
                    
            b.addActionListener(new ActionListener(){
        
                public void actionPerformed(ActionEvent ae){
                        
                        if( passing(true)){
                            
                            new Faculty();
                            
                        }
                        
                        else{
                            
                            new Student( id );
                            
                        }
                         
                            
                }
            });
                               
                    
        }
            
        }
        
                
             
         
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(1370,730);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
}
     
     public boolean passing(boolean prcd){
         return prcd;
         
     }
     
}


