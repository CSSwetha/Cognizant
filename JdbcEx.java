import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JdbcEx {
public static void main(String[] args) {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdbname","username","password");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from students");
while(rs.next()) {
System.out.println("ID: "+rs.getInt("id")+" Name: "+rs.getString("name")+" Age: "+rs.getInt("age"));
}
con.close();
}catch(Exception e){
System.out.println(e);
}
}
}
