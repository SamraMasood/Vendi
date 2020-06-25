import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColdDrinks extends JFrame implements ActionListener {
    JButton btnnext;
    JButton btnBack;

    public ColdDrinks(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(550, 0, 320, 400);
        setResizable(false);
        setTitle("Cold Drinks");
        JLabel labelchoosecolddrink=new JLabel("You Choose Coca cola ");
        labelchoosecolddrink.setBounds(20,0,320,40);

        Font font1=new Font("Arial",Font.BOLD,25);
        labelchoosecolddrink.setFont(font1);
        labelchoosecolddrink.setForeground(Color.RED);

        add(labelchoosecolddrink);

        btnnext = new JButton("Next");
        btnnext.setBounds(150,300,90,40);
        btnnext.addActionListener(this);
        add(btnnext);


        btnBack = new JButton("Back");
        btnBack.setBounds(50,300,90,40);
        btnBack.addActionListener(this);
        add(btnBack);


        ImageIcon icon2=new ImageIcon("C:\\Ali#/cocacola.jpg");//refrence and path of image
        setIconImage(icon2.getImage()); //setting image like setters


        JLabel background = new JLabel("", icon2, JLabel.CENTER);//setting image on background
        background.setBounds(0,0,1200,700);//setting bounds of background of blue sofas
        add(background);// adding the image as background


        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnnext){
            new ChooseColddrinkAmountButtons();
            dispose();
        }
        if(e.getSource()==btnBack){
            new MenuList();
            dispose();
        }

    }
}
