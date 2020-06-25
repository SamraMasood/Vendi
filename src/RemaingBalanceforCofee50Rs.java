import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemaingBalanceforCofee50Rs extends JFrame implements ActionListener {
    JButton btnContinue;
    JButton btnCancle;
    public RemaingBalanceforCofee50Rs(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1900, 950);
        setResizable(false);
        setTitle("Balance");
        JLabel label=new JLabel("Item : Cofee! ");
        label.setBounds(710,60,300,40);

        Font font=new Font("Arial",Font.BOLD,20);
        label.setFont(font);
        label.setForeground(Color.WHITE);

        add(label);

        JLabel label1=new JLabel("Cost Price : 50Rs.");
        label1.setBounds(710,120,330,40);

        Font font2=new Font("Arial",Font.BOLD,20);
        label1.setFont(font2);

        label1.setForeground(Color.WHITE);

        add(label1);


        JLabel label2=new JLabel("Remaining Balance : 0Rs.");
        label2.setBounds(710,190,600,50);

        Font font3=new Font("Arial",Font.BOLD,20);
        label2.setFont(font3);

        label2.setForeground(Color.WHITE);

        add(label2);

        JLabel labelthnku=new JLabel("Thank You! ");
        labelthnku.setBounds(820,280,300,40);

        Font font1=new Font("Arial",Font.BOLD,40);
        labelthnku.setFont(font1);
        labelthnku.setForeground(Color.WHITE);

        add(labelthnku);

        btnContinue = new JButton("Continue");
        btnContinue.setBounds(750,380,130,40);
        btnContinue.addActionListener(this);
        add(btnContinue);

        btnCancle = new JButton("Cancle");
        btnCancle.setBounds(920,380,130,40);
        btnCancle.addActionListener(this);
        add(btnCancle);



        ImageIcon icon2=new ImageIcon("C:\\Ali#/balance.jpg");//refrence and path of image
        setIconImage(icon2.getImage()); //setting image like setters


        JLabel background = new JLabel("", icon2, JLabel.CENTER);//setting image on background
        background.setBounds(0,0,1200,700);//setting bounds of background of blue sofas
        add(background);// adding the image as background


        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnContinue){
            new MenuList();
            dispose();
        }
        if(e.getSource()==btnCancle){
            new GoodBye();
            dispose();
        }
    }
}
