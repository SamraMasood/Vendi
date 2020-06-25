import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Jucies extends JFrame implements ActionListener {
    JButton btnnext;
    JButton btnBack;

    public Jucies(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 0, 415, 450);
        setResizable(false);
        setTitle("Juice");
        JLabel labelchooseJucies=new JLabel("You Choose Juice ");
        labelchooseJucies.setBounds(50,40,300,40);

        Font font1=new Font("Arial",Font.BOLD,30);
        labelchooseJucies.setFont(font1);
        labelchooseJucies.setForeground(Color.GREEN);

        add(labelchooseJucies);


        btnnext = new JButton("Next");
        btnnext.setBounds(200,350,100,40);
        btnnext.addActionListener(this);
        add(btnnext);


        btnBack = new JButton("Back");
        btnBack.setBounds(80,350,100,40);
        btnBack.addActionListener(this);
        add(btnBack);


        ImageIcon icon2=new ImageIcon("C:\\Ali#/newjuic.png");//refrence and path of image
        setIconImage(icon2.getImage()); //setting image like setters


        JLabel background = new JLabel("", icon2, JLabel.CENTER);//setting image on background
        background.setBounds(0,0,1200,700);//setting bounds of background of blue sofas
        add(background);// adding the image as background


        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnnext){
            new ChooseJuciesAmountfromButtons();
            dispose();
        }
        if(e.getSource()==btnBack){
            new MenuList();
            dispose();
        }

    }
}
