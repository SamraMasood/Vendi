import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuList extends JFrame implements ActionListener {
    JButton btnchooseLays;
    JButton btnchooseBiscuits;
    JButton btnchooseJuices;
    JButton btnchooseColdDrinks;
    JButton btnchooseCakes;
    JButton btnchooseTea;
    JButton btnchooseCofee;
    JButton btnchooseChoclates;
    JButton btnchoosePeanuts;
    JButton btnBack;


    public MenuList(){
        JLabel labelImage;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1900,950 );
        setResizable(false);
        setTitle("Menu List");
        JLabel labelitem=new JLabel("Choose Item ");
        labelitem.setBounds(560,70,1900,40);

        Font font2=new Font("Arial",Font.BOLD,50);
        labelitem.setFont(font2);

        labelitem.setForeground(Color.BLUE);

        add(labelitem);

        btnchooseLays=new JButton("Lays 50Rs.");
        btnchooseLays.setBounds(500,200,130,45);
        btnchooseLays.addActionListener(this);
        add(btnchooseLays);



        btnchooseBiscuits=new JButton("Oreo 20Rs.");
        btnchooseBiscuits.setBounds(650,200,130,45);
        btnchooseBiscuits.addActionListener(this);
        add(btnchooseBiscuits);


        btnchooseJuices=new JButton("Juices 30Rs.");
        btnchooseJuices.setBounds(800,200,130,45);
        btnchooseJuices.addActionListener(this);
        add(btnchooseJuices);


        btnchooseColdDrinks=new JButton("Coca Cola 50Rs.");
        btnchooseColdDrinks.setBounds(500,300,130,45);
        btnchooseColdDrinks.addActionListener(this);
        add(btnchooseColdDrinks);


        btnchooseCakes=new JButton("Cakes 50Rs.");
        btnchooseCakes.setBounds(650,300,130,45);
        btnchooseCakes.addActionListener(this);
        add(btnchooseCakes);


        btnchooseTea=new JButton("Tea 50Rs.");
        btnchooseTea.setBounds(800,300,130,45);
        btnchooseTea.addActionListener(this);
        add(btnchooseTea);


        btnchooseCofee=new JButton("Coffee 50Rs.");
        btnchooseCofee.setBounds(500,400,130,45);
        btnchooseCofee.addActionListener(this);
        add(btnchooseCofee);



        btnchooseChoclates=new JButton("Chocolates 50Rs.");
        btnchooseChoclates.setBounds(650,400,130,45);
        btnchooseChoclates.addActionListener(this);
        add(btnchooseChoclates);


        btnchoosePeanuts=new JButton("Peanuts 30Rs.");
        btnchoosePeanuts.setBounds(800,400,130,45);
        btnchoosePeanuts.addActionListener(this);
        add(btnchoosePeanuts);


        btnBack = new JButton("Back");
        btnBack.setBounds(650,500,130,40);
        btnBack.addActionListener(this);
        add(btnBack);

        ImageIcon icon2=new ImageIcon("C:\\Ali#\\src/items.jpg");//refrence and path of image
        setIconImage(icon2.getImage()); //setting image like setters
        labelImage=new JLabel("",icon2,JLabel.CENTER);//setting image on background
        labelImage.setBounds(0,0,510,316);//setting bounds of background of blue sofas
        add(labelImage);// adding the image as background

        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnchooseLays){
            new Lays();
            dispose();
        }
        if(e.getSource()==btnchooseBiscuits){
            new Biscuits();
            dispose();
        }

        if(e.getSource()==btnchooseColdDrinks){
            new ColdDrinks();
            dispose();
        }

        if(e.getSource()==btnchooseJuices){
            new Jucies();
            dispose();
        }
      if(e.getSource()==btnchooseCakes){
            new Cakes();
            dispose();
        }
        if(e.getSource()==btnchooseTea){
            new Tea();
            dispose();
        }
        if(e.getSource()==btnchooseCofee){
            new Cofee();
            dispose();
        }
        if(e.getSource()==btnchooseChoclates){
            new Chocolates();
            dispose();
        }
        if(e.getSource()==btnchoosePeanuts){
            new Peanuts();
            dispose();
        }

        if(e.getSource()==btnBack){
            new Instruction();
            dispose();
        }

    }
}
