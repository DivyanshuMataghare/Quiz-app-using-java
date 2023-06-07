import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
public class Login extends JFrame implements ActionListener{

    JButton rules,back;
    JTextField tfname;
    Login(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null); //this means that the we dont need the already layout avaliable we create our layout

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/login.jpeg"));//add an image to the frame
        //we cannot direct add image to frame first we need to create a jlabel of that image and then add to frame
        JLabel image = new JLabel(i1);
        image.setBounds(0 ,0,600,500);
        add(image);

        JLabel heading = new JLabel("Simple Minds");//creating heading
        heading.setBounds(850,20,200,40); //align the text
        heading.setFont(new Font("Monqolian Baiti",Font.BOLD,30));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel name = new JLabel("Enter your Name");//creating heading
        name.setBounds(880,150,200,20); //align the text
        name.setFont(new Font("Monqolian Baiti",Font.BOLD,18));
        name.setForeground(Color.BLUE);
        add(name);

        //creating input field
        tfname = new JTextField();
        tfname.setBounds(850,180,200,25);
        tfname.setFont(new Font("Times new Roman",Font.BOLD,20));
        add(tfname);

         rules = new JButton("Rules");
         rules.setBounds(850,250,90,25);
         rules.setForeground(Color.WHITE);
         rules.setBackground(new Color(30,144,254));
         rules.addActionListener(this);//to perform the task
         add(rules);

         back = new JButton("Back");
         back.setBounds(960,250,90,25);
         back.setForeground(Color.WHITE);
         back.setBackground(new Color(30,144,254));
         back.addActionListener(this);//to perform the task
         add(back);


        setSize(1200,500);//size of frame
        setLocation(400,200);//location of frame
        setVisible(true);//create a frame

    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();//anonymous object which is not used in program
    }    

    
}
