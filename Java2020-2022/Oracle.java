import java.util.*;
import java.sql.*;
public class Oracle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try
        {
            Class.forName("jdbc.oracle.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "user_name", "password");
            String sql = "create table emp(id number(10), name varchar2(40), age number(3)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            con.commit();


            for(int i = 1; i<=3; i++)
            {
                System.out.println("Enter emp id: ");
                int id = in.nextInt();
                System.out.println("Enter name: ");
                String name = in.next();
                System.out.println("Enter age: ");
                int age = in.nextInt();
                String SQL = "INSERT INTO EMP VALUES(?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(SQL);
                pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.setInt(3, age);
                pstmt.executeUpdate();
                pstmt.close();
            }
            con.commit();
            PreparedStatement up = con.prepareStatement("UPDATE emp id = " + 3 + " WHERE name = 'qwpo'");
            up.executeUpdate();
            con.commit();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while(rs.next())
            {
                System.out.println("Employee ID = " + rs.getInt(1));
                System.out.println("Employee Name = "+ rs.getString(2));
                System.out.println("Employee Age = " + rs.getInt(3));
            }
            con.close();
            stmt.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
