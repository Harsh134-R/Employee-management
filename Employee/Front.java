
package Employee.manage.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Front extends JFrame implements ActionListener{
    Front(){
        setTitle("Employee Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        JLabel heading =  new JLabel("Welcome!!");
        heading.setBounds(80,50,1200,60);
        heading.setFont(new Font(" Monospaced",Font.BOLD,60));
        heading.setForeground(Color.GRAY);



        ImageIcon first = new ImageIcon(ClassLoader.getSystemResource("icons/front1.jpg"));
        Image i1 = first.getImage().getScaledInstance(1080,720,Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel image = new JLabel(i2);
        image.setBounds(0,0,1080,720);
        add(heading);
        add(image);


        JButton click = new JButton("Click Here To Continue");
        click.setBounds(800,50,200,60);
        click.setBackground(Color.BLACK);
        click.setForeground(Color.WHITE);
        click.addActionListener(this);
        image.add(click);






        setSize(1080,720);
        setLocation(100,50);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Front();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();
    }
}
