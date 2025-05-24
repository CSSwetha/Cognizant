import java.util.Scanner;
public class Factorial{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.print("Enter a integer: ");
int number = s.nextInt();
if (number < 0){
System.out.println("Factorial is not defined for negative numbers.");
} 
else{
long fact = 1; 
for (int i = 1; i <= number; i++) {
fact *= i;
}
System.out.println("Factorial of " + number + " is: " + fact);
}
s.close();
}
}
