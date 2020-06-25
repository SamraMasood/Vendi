import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cofee extends JFrame implements ActionListener {
    JButton btnnext;
    JButton btnBack;

    public Cofee(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(550, 0, 350, 500);
        setResizable(false);
        setTitle("Coffee");
        JLabel labelchoosecofee=new JLabel("You Choose Coffee ");
        labelchoosecofee.setBounds(30,40,300,40);

        Font font1=new Font("Arial",Font.BOLD,30);
        labelchoosecofee.setFont(font1);
        labelchoosecofee.setForeground(Color.BLACK);

        add(labelchoosecofee);



        btnnext = new JButton("Next");
        btnnext.setBounds(180,380,100,40);
        btnnext.addActionListener(this);
        add(btnnext);


        btnBack = new JButton("Back");
        btnBack.setBounds(60,380,100,40);
        btnBack.addActionListener(this);
        add(btnBack);


        ImageIcon icon2=new ImageIcon("C:\\Ali#/coffeee2.jpg");//refrence and path of image
        setIconImage(icon2.getImage()); //setting image like setters


        JLabel background = new JLabel("", icon2, JLabel.CENTER);//setting image on background
        background.setBounds(0,0,1200,700);//setting bounds of background of blue sofas
        add(background);// adding the image as background


        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnnext){
            new ChooseCofeeAmountfromButtons();
            dispose();
        }
        if(e.getSource()==btnBack){
            new MenuList();
            dispose();
        }

    }
}

