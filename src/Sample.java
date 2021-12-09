import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class Sample {
        public static void main(String args[]){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/anshika","root","");
//here sonoo is database name, root is username and password
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from test1");
                while(rs.next())
                    System.out.println(rs.getString(1)+"  "+rs.getInt(2));
                con.close();
            }catch(Exception e){ System.out.println(e);}

    }
}
