import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    String name;
    JButton back,start;
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome "+ name + " to simple Minds !");//creating heading
        heading.setBounds(100,50,700,30); //align the text
        heading.setFont(new Font("Monqolian Baiti",Font.BOLD,30));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel rules = new JLabel();//creating rules
        rules.setBounds(30,80,700,500); //align the text
        rules.setFont(new Font("Monqolian Baiti",Font.PLAIN,16));
        //rules.setForeground(Color.BLUE);
        rules.setText(
            "<html>"+
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(80,550,90,25);
        back.setForeground(Color.WHITE);
        back.setBackground(new Color(30,144,254));
        back.addActionListener(this);//to perform the task
        add(back);

        start = new JButton("Start");
        start.setBounds(260,550,90,25);
        start.setForeground(Color.WHITE);
        start.setBackground(new Color(30,144,254));
        start.addActionListener(this);//to perform the task
        add(start);

        setSize(750,650);
        setLocation(350,100);
        setVisible(true);
    }
   public static void main(String[] args) {
    new Rules("User"); 
   }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== start){
            setVisible(false);
            new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    } 
}
