
package principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Ale Funes
 */
public class MainClass {

    public static Connection conn (){
        try {
            String url = "jdbc:mysql://localhost:3306/mydatabase?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "admin";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException|ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }  
    
    public static void main(String[] args) {
        Connection conn = MainClass.conn();
        PreparedStatement pst;
        ResultSet rs;
        try{
        String sqlquery = "SELECT * FROM userlogin";
        pst = conn.prepareStatement(sqlquery);
        rs = pst.executeQuery();
            if (rs.next()) {
                String name = rs.getString(2);
                System.out.println(name);
            }
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e);
        }
    }
}
