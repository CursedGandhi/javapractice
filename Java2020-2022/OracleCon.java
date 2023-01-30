import java.sql.*;

class OracleCon{
    public static void main(String[] args) {
        try
        {
            //load and register database driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Create a connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "user_name", "password");
            //create a statement
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while(rs.next())
            {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}