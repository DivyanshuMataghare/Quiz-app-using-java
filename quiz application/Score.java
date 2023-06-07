import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    JButton submit,exit;
    Score(String name,int score){
        setBounds(600,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/score.png"));//add an image to the frame

        Image i2 =i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);//to scale the image

        ImageIcon i3 = new ImageIcon(i2);
        //we cannot direct add image to frame first we need to create a jlabel of that image and then add to frame
        JLabel image = new JLabel(i3);
        image.setBounds(0 ,200,300,250);
        add(image);

        JLabel heading = new JLabel("Thank you "+ name+ " for playing Simple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);

        JLabel lblscore = new JLabel("Your Score is: "+score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(lblscore);

        submit = new JButton("Play Again");
        submit.setBounds(450,270,120,30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
       // submit.setEnabled(false);//to unable the submit button
        add(submit);

        exit = new JButton("Exit");
        exit.setBounds(450,340,120,30);
        exit.setBackground(new Color(30,144,255));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
       // submit.setEnabled(false);//to unable the submit button
        add(exit);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Score("User",0);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== submit){
            setVisible(false);
            new Login();
        }
        if(e.getSource()== exit){
            setVisible(false);
        }
    }
}
