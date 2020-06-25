import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biscuits extends JFrame implements ActionListener {
    JButton btnBack;
    JButton btnnext;

    public Biscuits(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 0, 360, 500);
        setResizable(false);
        setTitle("Biscuits");
        JLabel labelchoosebiscuits=new JLabel("You Choose Oreo ");
        labelchoosebiscuits.setBounds(30,20,400,40);

        Font font1=new Font("Arial",Font.BOLD,30);
        labelchoosebiscuits.setFont(font1);
        labelchoosebiscuits.setForeground(Color.BLUE);

        add(labelchoosebiscuits);



        btnBack = new JButton("Back");
        btnBack.setBounds(50,390,100,40);
        btnBack.addActionListener(this);
        add(btnBack);
        btnnext = new JButton("Next");
        btnnext.setBounds(170,390,100,40);
        btnnext.addActionListener(this);
        add(btnnext);


        ImageIcon icon2=new ImageIcon("C:\\Ali#/oreo.jpg");//refrence and path of image
        setIconImage(icon2.getImage()); //setting image like setters


        JLabel background = new JLabel("", icon2, JLabel.CENTER);//setting image on background
        background.setBounds(0,0,1200,700);//setting bounds of background of blue sofas
        add(background);// adding the image as background


        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnnext){
            new SelectAmountPage();
            dispose();
        }
        if(e.getSource()==btnBack){
            new MenuList();
            dispose();
        }

    }
}

