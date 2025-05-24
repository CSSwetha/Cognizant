import java.net.*;  
import java.io.*;  
public class Client {  
public static void main(String[] args) throws Exception {  
Socket s = new Socket("localhost", 6666);  
DataInputStream dis = new DataInputStream(s.getInputStream());  
DataOutputStream dos = new DataOutputStream(s.getOutputStream());  
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
String str = "", str2 = "";  
while (!str.equals("stop")) {  
str2 = br.readLine();  
dos.writeUTF(str2);  
dos.flush();  
str = dis.readUTF();  
System.out.println("Server says: " + str);  
}  
dos.close();  
s.close();  
}  
}
