import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WlcmToVendi extends JFrame implements ActionListener {
    JButton btnNext;

    public WlcmToVendi(){
        JLabel background;//declaring an object of JLabel
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//by clicking on close button on frame it closes the Frame
        setBounds(350, 0, 740, 620);//boundries setting
        setResizable(false);//remove maximize or minimize option
        setTitle("Welcome To Vendi! ");//Title written near java default logo



        btnNext = new JButton("Next");
        btnNext.setBounds(300,230,127,30);
        btnNext.addActionListener(this);
        add(btnNext);



        ImageIcon icon2=new ImageIcon("C:\\Ali#\\src/vendi (2).jpg");//refrence and path of image
        setIconImage(icon2.getImage()); //setting image like setters



        background=new JLabel("",icon2,JLabel.CENTER);//setting image on background
        background.setBounds(0,0,1200,700);//setting bounds of background of blue sofas
        add(background);// adding the image as background



        setVisible(true);//just create/make visible the Frame

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnNext){
            new Instruction();
            dispose();
        }

    }
}
