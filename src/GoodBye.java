import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoodBye extends JFrame implements ActionListener {
    JButton btninstruction;
    JButton btnBack;
    public GoodBye(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1900, 950);
        setResizable(false);
        setTitle("Good Bye");

        JLabel labelCashBack=new JLabel("GoodBye ");
        labelCashBack.setBounds(350,180,300,90);

        Font font1=new Font("Arial",Font.BOLD,50);
        labelCashBack.setFont(font1);

        labelCashBack.setForeground(Color.BLACK);

        add(labelCashBack);



        btninstruction = new JButton("Instructions");
        btninstruction.setBounds(500,380,130,40);
        btninstruction.addActionListener(this);
        add(btninstruction);


        btnBack = new JButton("Back");
        btnBack.setBounds(300,380,130,40);
        btnBack.addActionListener(this);
        add(btnBack);
        ImageIcon icon2=new ImageIcon("C:\\Ali#/goodbye.jpg");//refrence and path of image
        setIconImage(icon2.getImage()); //setting image like setters


        JLabel background = new JLabel("", icon2, JLabel.CENTER);//setting image on background
        background.setBounds(0,0,1200,700);//setting bounds of background of blue sofas
        add(background);// adding the image as background


        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btnBack){
            new RemainingBalanceLays();
            dispose();
        }
        if(e.getSource()==btninstruction){
            new Instruction();
            dispose();
        }

    }
}
