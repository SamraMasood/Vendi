import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Peanuts extends JFrame implements ActionListener {
    JButton btnnext;
    JButton btnBack;

    public Peanuts(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(350, 0, 500, 600);
        setResizable(false);
        setTitle("Peanuts");
        JLabel labelchoosePeanuts=new JLabel("You Choose Peanuts ");
        labelchoosePeanuts.setBounds(100,20,500,40);

        Font font1=new Font("Arial",Font.BOLD,30);
        labelchoosePeanuts.setFont(font1);
        labelchoosePeanuts.setForeground(Color.YELLOW);

        add(labelchoosePeanuts);

        btnnext = new JButton("Next");
        btnnext.setBounds(260,500,130,40);
        btnnext.addActionListener(this);
        add(btnnext);


        btnBack = new JButton("Back");
        btnBack.setBounds(100,500,130,40);
        btnBack.addActionListener(this);
        add(btnBack);


        ImageIcon icon2=new ImageIcon("C:\\Ali#/peanuts.jpeg");//refrence and path of image
        setIconImage(icon2.getImage()); //setting image like setters


        JLabel background = new JLabel("", icon2, JLabel.CENTER);//setting image on background
        background.setBounds(0,0,1200,700);//setting bounds of background of blue sofas
        add(background);// adding the image as background


        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnnext){
            new ChoosePeanutsAmountfromButtons();
            dispose();
        }
        if(e.getSource()==btnBack){
            new MenuList();
            dispose();
        }

    }
}
