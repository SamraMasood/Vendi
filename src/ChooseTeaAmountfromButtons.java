import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChooseTeaAmountfromButtons extends JFrame implements ActionListener {
    JButton btnBack;
    JButton btn50;
    JButton btn100;
    JButton btninstruction;
    public ChooseTeaAmountfromButtons(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//by clicking on close button on frame it closes the Frame
        setBounds(0,0,1900,950);//boundries setting
        setResizable(false);//remove maximize or minimize option
        setTitle("Insert Amount");

        JLabel labelCashBack=new JLabel("Select Amount ");
        labelCashBack.setBounds(750,60,300,40);

        Font font1=new Font("Arial",Font.BOLD,40);
        labelCashBack.setFont(font1);

        labelCashBack.setForeground(Color.WHITE);

        add(labelCashBack);



        btninstruction = new JButton("Instructions");
        btninstruction.setBounds(920,350,130,40);
        btninstruction.addActionListener(this);
        add(btninstruction);


        btnBack = new JButton("Back");
        btnBack.setBounds(740,350,130,40);
        btnBack.addActionListener(this);
        add(btnBack);

        btn100 = new JButton("100Rs.");
        btn100.setBounds(820,240,130,40);
        btn100.addActionListener(this);
        add(btn100);

        btn50 = new JButton("50Rs.");
        btn50.setBounds(820,150,130,40);
        btn50.addActionListener(this);
        add(btn50);


        ImageIcon icon2=new ImageIcon("C:\\Ali#/mmenu2.jpg");//refrence and path of image
        setIconImage(icon2.getImage()); //setting image like setters
        JLabel labelImage = new JLabel("", icon2, JLabel.CENTER);//setting image on background
        labelImage.setBounds(0,0,300,256);//setting bounds of background of blue sofas
        add(labelImage);// adding the image as background


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btnBack){
            new Tea();
            dispose();
        }
        if(e.getSource()==btninstruction){
            new Instruction();
            dispose();
        }

        if(e.getSource()==btn50){
            new SelectedBtnfortea50Rs();
            dispose();
        }
        if(e.getSource()==btn100){
            new SelectedBtnfortea100Rs();
            dispose();
        }

    }
}
