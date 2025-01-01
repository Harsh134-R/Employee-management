package Employee.manage.system;
import java.sql.*;
public class Connect {
    Connection c; //it is interface
    Statement s;
    public Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Harsh134566@");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
