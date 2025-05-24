import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWrite{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.print("Enter to write to file: ");
String input = s.nextLine();
try {
FileWriter writer = new FileWriter("output.txt");
writer.write(input);
writer.close();
System.out.println("Data has been written to output.txt");
} catch (IOException e) {
System.out.println("error occurred.");
}
s.close();
}
}
