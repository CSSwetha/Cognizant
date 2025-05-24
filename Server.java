import java.net.*;  
import java.io.*;  
public class Server {  
public static void main(String[] args) throws Exception {  
ServerSocket ss = new ServerSocket(6666);  
Socket s = ss.accept();  
DataInputStream dis = new DataInputStream(s.getInputStream());  
DataOutputStream dos = new DataOutputStream(s.getOutputStream());  
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
String str = "", str2 = "";  
while (!str.equals("stop")) {  
str = dis.readUTF();  
System.out.println("Client says: " + str);  
str2 = br.readLine();  
dos.writeUTF(str2);  
dos.flush();  
}  
dis.close();  
s.close();  
ss.close();  
}  
}
