import java.util.Scanner;
public class Palindrome{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = s.nextLine();
String palin = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
String reversed = new StringBuilder(palin).reverse().toString();
if (palin.equals(reversed)) {
System.out.println("The string is a palindrome.");
} else {
System.out.println("The string is not a palindrome.");
}
s.close();
}
}
