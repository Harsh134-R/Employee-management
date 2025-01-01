package Employee.manage.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Home extends JFrame implements ActionListener {

    JButton add,view,remove,update;
    Home()
    {   setLayout(null);
        setTitle("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);


        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image a2 = a1.getImage().getScaledInstance(1080, 720, Image.SCALE_SMOOTH);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel image12 = new JLabel(a3);
        image12.setBounds(0, 0,1080 , 720);
        add(image12);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(500, 50, 800, 60);
        heading.setFont(new Font("BankGothic Lt BT", Font.BOLD, 30));
        image12.add(heading);


        add = new JButton("Add Employee");
        add.setBounds(650, 150, 150, 30);
        add.addActionListener(this);
        image12.add(add);

        view = new JButton("view Employee");
        view.setBounds(650, 200, 150, 30);
        view.addActionListener(this);
        image12.add(view);

        update = new JButton("update Employee");
        update.setBounds(650, 250, 150, 30);
        update.addActionListener(this);

        image12.add(update);

        remove = new JButton("remove Employee");
        remove.setBounds(650, 300, 150, 30);
        remove.addActionListener(this);
        image12.add(remove);







        setSize(1080,720);
        setLocation(100,50);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Home();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add)
        {
            setVisible(false);
            new Add();
        }
        else if(e.getSource()==view)
        {
            setVisible(false);
            new View();
        }
        else if(e.getSource()==update)
        {
            new View();

        }
        else {
            new Remove();
        }

    }
}
