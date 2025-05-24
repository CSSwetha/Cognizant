import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class TransactionExample {
private Connection getConnection() throws Exception {
Class.forName("com.mysql.cj.jdbc.Driver");
return DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdbname","username","password");
}
public void transfer(int fromAccountId, int toAccountId, double amount) {
Connection con = null;
try {
con = getConnection();
con.setAutoCommit(false);
PreparedStatement debit = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
debit.setDouble(1, amount);
debit.setInt(2, fromAccountId);
int rows1 = debit.executeUpdate();
PreparedStatement credit = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
credit.setDouble(1, amount);
credit.setInt(2, toAccountId);
int rows2 = credit.executeUpdate();
if(rows1 == 1 && rows2 == 1) {
con.commit();
System.out.println("Transfer successful");
} else {
con.rollback();
System.out.println("Transfer failed, rolled back");
}
} catch(Exception e) {
try {
if(con != null) con.rollback();
}catch(Exception ex){}
System.out.println("Exception: " + e);
} finally {
try {
if(con != null) con.setAutoCommit(true);
if(con != null) con.close();
}catch(Exception ex){}
}
}
public static void main(String[] args) {
TransactionExample te = new TransactionExample();
te.transfer(101, 102, 500.0);
}
}
