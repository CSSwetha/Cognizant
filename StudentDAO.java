import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {
private Connection getConnection() throws Exception {
Class.forName("com.mysql.cj.jdbc.Driver");
return DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdbname","username","password");
}
public void insertStudent(int id, String name, int age) {
try(Connection con = getConnection();
PreparedStatement ps = con.prepareStatement("INSERT INTO students (id, name, age) VALUES (?, ?, ?)")) {
ps.setInt(1, id);
ps.setString(2, name);
ps.setInt(3, age);
ps.executeUpdate();
}catch(Exception e) {
System.out.println(e);
}
}
public void updateStudent(int id, String name, int age) {
try(Connection con = getConnection();
PreparedStatement ps = con.prepareStatement("UPDATE students SET name=?, age=? WHERE id=?")) {
ps.setString(1, name);
ps.setInt(2, age);
ps.setInt(3, id);
ps.executeUpdate();
}catch(Exception e) {
System.out.println(e);
}
}
public static void main(String[] args) {
StudentDAO dao = new StudentDAO();
dao.insertStudent(1, "Alice", 20);
dao.updateStudent(1, "Alice Smith", 21);
}
}

