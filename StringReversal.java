import java.util.Scanner;
public class StringReversal {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = s.nextLine();
String reversed = new StringBuilder(str).reverse().toString();
System.out.println("Reversed string: " + reversed);
s.close();
}
}
