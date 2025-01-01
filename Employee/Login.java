package Employee.manage.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.Arrays;

public class Login extends JFrame implements ActionListener{
    JTextField tuser;
    JPasswordField tpass;
    Login() {
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 400);
        add(layeredPane);

        ImageIcon first1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i11 = first1.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);
        ImageIcon i22 = new ImageIcon(i11);
        JLabel image1 = new JLabel(i22);
        image1.setBounds(0, 0, 500, 400);
        layeredPane.add(image1, Integer.valueOf(0));

        //creating user label
        JLabel user = new JLabel("Username");
        user.setBounds(40,20,100,30);
        user.setForeground(new Color(0x000000));
        layeredPane.add(user, Integer.valueOf(1));

        //creating text box
        tuser = new JTextField();
        tuser.setBounds(150,20,150,30);
        layeredPane.add(tuser, Integer.valueOf(1));

        //creating password label
        JLabel pass = new JLabel("Password");
        pass.setBounds(40,50,100,30);
        pass.setForeground(new Color(0x000000));
        layeredPane.add(pass, Integer.valueOf(1));

        //creating password box
         tpass = new JPasswordField();
        tpass.setBounds(150,50,150,30);
        layeredPane.add(tpass, Integer.valueOf(1));

        JButton login = new JButton("Login");
        login.setBounds(95,100,80,40);
        login.setBackground(new Color(29, 59, 85));
        login.setForeground(new Color(156, 191, 221));
        login.addActionListener(this);
        layeredPane.add(login, Integer.valueOf(1));

        setSize(500, 400);
        setLocation(450, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String username = tuser.getText();
            String password = new String(tpass.getPassword());


            Connect c = new Connect();
            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";

          ResultSet rs = c.s.executeQuery(query);
          if(rs.next())
          {
              setVisible(false);
              new Home();
          }
          else
          {
              JOptionPane.showMessageDialog(null, "Invalid username and Password");

          }

        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
    }
}
