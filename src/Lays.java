import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lays extends JFrame implements ActionListener {
    JButton btnnext;
    JButton btnBack;

    public Lays(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 0, 460, 510);
        setResizable(false);
        setTitle("Lays");

        JLabel labelchooselays=new JLabel("You Choose Lays ");
        labelchooselays.setBounds(100,20,300,40);

        Font font1=new Font("Arial",Font.BOLD,30);
        labelchooselays.setFont(font1);
        labelchooselays.setForeground(Color.RED);

        add(labelchooselays);




        btnnext = new JButton("Next");
        btnnext.setBounds(230,410,130,40);
        btnnext.addActionListener(this);
        add(btnnext);


        btnBack = new JButton("Back");
        btnBack.setBounds(90,410,130,40);
        btnBack.addActionListener(this);
        add(btnBack);


        ImageIcon icon2=new ImageIcon("C:\\Ali#/salted.jpg");//refrence and path of image
        setIconImage(icon2.getImage()); //setting image like setters


        JLabel background = new JLabel("", icon2, JLabel.CENTER);//setting image on background
        background.setBounds(0,0,1200,700);//setting bounds of background of blue sofas
        add(background);// adding the image as background


        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnnext){
            new ChooseLaysAmountfromButtons();
            dispose();
        }
        if(e.getSource()==btnBack){
            new MenuList();
            dispose();
        }

    }
}
