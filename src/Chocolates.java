import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chocolates extends JFrame implements ActionListener {
    JButton btnnext;
    JButton btnBack;

    public Chocolates(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(350, 0, 500, 600);
        setResizable(false);
        setTitle("Chocolates");
        btnnext = new JButton("Next");
        btnnext.setBounds(260,510,130,40);
        btnnext.addActionListener(this);
        add(btnnext);


        btnBack = new JButton("Back");
        btnBack.setBounds(100,510,130,40);
        btnBack.addActionListener(this);
        add(btnBack);


        ImageIcon icon2=new ImageIcon("C:\\Ali#/dairymilk.jpeg");//refrence and path of image
        setIconImage(icon2.getImage()); //setting image like setters


        JLabel background = new JLabel("", icon2, JLabel.CENTER);//setting image on background
        background.setBounds(0,0,1200,700);//setting bounds of background of blue sofas
        add(background);// adding the image as background


        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnnext){
            new ChoosechoclateAmountfromButtons();
            dispose();
        }
        if(e.getSource()==btnBack){
            new MenuList();
            dispose();
        }

    }
}