import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Instruction extends JFrame implements ActionListener {
    JButton btnNext;
    JButton btnBack;
    public Instruction(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1900, 950);
        setResizable(false);
        setTitle("Instructions! ");


        JLabel label=new JLabel("Instructions ");
        label.setBounds(650,40,300,40);

        Font font2=new Font("Arial",Font.BOLD,30);
        label.setFont(font2);
        label.setForeground(Color.WHITE);

        add(label);

        JLabel label1=new JLabel("1. Press Next for Menu List. ");
        label1.setBounds(450,100,400,40);

        Font font1=new Font("Arial",Font.BOLD,18);
        label1.setFont(font1);
        label1.setForeground(Color.WHITE);

        add(label1);

        JLabel label2=new JLabel("2. Select Item. ");
        label2.setBounds(450,150,1000,40);

        Font font3=new Font("Arial",Font.BOLD,18);
        label2.setFont(font3);
        label2.setForeground(Color.WHITE);

        add(label2);
        JLabel label3=new JLabel("3. Press Amount Button. ");
        label3.setBounds(450,200,600,40);

        Font font4=new Font("Arial",Font.BOLD,18);
        label3.setFont(font4);
        label3.setForeground(Color.WHITE);

        add(label3);

        JLabel label4=new JLabel("4. Press Cash Back Button. ");
        label4.setBounds(450,250,400,40);

        Font font5=new Font("Arial",Font.BOLD,18);
        label4.setFont(font5);
        label4.setForeground(Color.WHITE);

        add(label4);



        JLabel label5=new JLabel("5. Press Continue to choose another Item. ");
        label5.setBounds(450,300,600,40);

        Font font6=new Font("Arial",Font.BOLD,18);
        label5.setFont(font6);
        label5.setForeground(Color.WHITE);

        add(label5);

        JLabel label6=new JLabel("6. Press Cancle Button to Leave. ");
        label6.setBounds(450,350,400,40);

        Font font7=new Font("Arial",Font.BOLD,18);
        label6.setFont(font7);
        label6.setForeground(Color.WHITE);

        add(label6);

        JLabel label7=new JLabel("7. Press Cancel Button to go into Instruction Page. ");
        label7.setBounds(450,400,500,40);

        Font font8=new Font("Arial",Font.BOLD,18);
        label7.setFont(font8);
        label7.setForeground(Color.WHITE);

        add(label7 );
        JLabel label8=new JLabel("8. Press Back Button to go Previous Page. ");
        label8.setBounds(450,450,500,40);

        Font font9=new Font("Arial",Font.BOLD,18);
        label8.setFont(font9);
        label8.setForeground(Color.WHITE);

        add(label8);
        JLabel label9=new JLabel("9. Press Next Button to into Next Page. ");
        label9.setBounds(450,500,500,40);

        Font font10=new Font("Arial",Font.BOLD,18);
        label9.setFont(font10);
        label9.setForeground(Color.WHITE);

        add(label9);

        JLabel label10=new JLabel("10. Press Instructions Button to go into Instruction Page. ");
        label10.setBounds(450,550,500,40);

        Font font11=new Font("Arial",Font.BOLD,18);
        label10.setFont(font11);
        label10.setForeground(Color.WHITE);

        add(label10);


        btnNext = new JButton("Next");
        btnNext.setBounds(620,650,130,40);
        btnNext.addActionListener(this);
        add(btnNext);

        btnBack = new JButton("Back");
        btnBack.setBounds(480,650,130,40);
        btnBack.addActionListener(this);
        add(btnBack);

        ImageIcon icon2=new ImageIcon("C:\\Ali#/menulist.jpg");//refrence and path of image
        setIconImage(icon2.getImage()); //setting image like setters
        JLabel labelImage = new JLabel("", icon2, JLabel.CENTER);//setting image on background
        labelImage.setBounds(0,0,510,316);//setting bounds of background of blue sofas
        add(labelImage);// adding the image as background



        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnNext){
            new MenuList();
            dispose();
        }
        if(e.getSource()==btnBack){
            new WlcmToVendi();
            dispose();
        }


    }
}
