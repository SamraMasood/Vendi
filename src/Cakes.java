import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cakes extends JFrame implements ActionListener {
    JButton btnnext;
    JButton btnBack;

    public Cakes(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(350, 0, 530, 500);
        setResizable(false);
        setTitle("Cakes");
        JLabel labelchoosecakes=new JLabel("You Choose Cake ");
        labelchoosecakes.setBounds(120,40,300,40);

        Font font1=new Font("Arial",Font.BOLD,30);
        labelchoosecakes.setFont(font1);
        labelchoosecakes.setForeground(Color.BLUE);

        add(labelchoosecakes);


        btnnext = new JButton("Next");
        btnnext.setBounds(290,360,130,40);
        btnnext.addActionListener(this);
        add(btnnext);


        btnBack = new JButton("Back");
        btnBack.setBounds(150,360,130,40);
        btnBack.addActionListener(this);
        add(btnBack);


        ImageIcon icon2=new ImageIcon("C:\\Ali#/cake.jpeg");//refrence and path of image
        setIconImage(icon2.getImage()); //setting image like setters


        JLabel background = new JLabel("", icon2, JLabel.CENTER);//setting image on background
        background.setBounds(0,0,1200,700);//setting bounds of background of blue sofas
        add(background);// adding the image as background


        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnnext){
            new ChooseCakesAmountfromButtons();
            dispose();
        }
        if(e.getSource()==btnBack){
            new MenuList();
            dispose();
        }

    }
}

