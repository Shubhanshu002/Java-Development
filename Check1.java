import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Check1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String url="jdbc:mysql://localhost/student";
        String unam="root";
        String pass="Shubhanshu@12";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String query="select * from children where id=2";
        Connection con;
        try {
            con = DriverManager.getConnection(url,unam,pass);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            rs.next();
            String name=rs.getString("name");
            System.out.println(name);
            st.close();
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

}
