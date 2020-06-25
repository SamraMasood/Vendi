import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectedBtn50RsJuices extends JFrame implements ActionListener {
    JButton btncashback;
    JButton btnBack;
    public SelectedBtn50RsJuices(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(350, 0, 620, 600);
        setResizable(false);
        setTitle("Cash Back");
        JLabel labelPress=new JLabel("Press Cash Back");
        labelPress.setBounds(180,90,500,40);

        Font font2=new Font("Arial",Font.BOLD,40);
        labelPress.setFont(font2);
        labelPress.setForeground(Color.WHITE);
        add(labelPress);

        btncashback=new JButton("Cash Back");
        btncashback.setBounds(240,190,130,50);
        btncashback.addActionListener(this);
        add(btncashback);

        btnBack = new JButton("Back");
        btnBack.setBounds(240,300,130,50);
        btnBack.addActionListener(this);
        add(btnBack);

        ImageIcon icon2=new ImageIcon("C:\\Ali#/cashback2.jpg");//refrence and path of image
        setIconImage(icon2.getImage()); //setting image like setters


        JLabel background = new JLabel("", icon2, JLabel.CENTER);//setting image on background
        background.setBounds(0,0,1200,700);//setting bounds of background of blue sofas
        add(background);// adding the image as background


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btncashback){
            new RemainingBalanceJuuices50Rs();
            dispose();
        }
        if(e.getSource()==btnBack){
            new ChooseJuciesAmountfromButtons();
            dispose();
        }
    }
}
