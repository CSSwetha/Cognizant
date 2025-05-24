import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first number: ");
double num1 = scanner.nextDouble();
System.out.print("Enter the second number: ");
double num2 = scanner.nextDouble();
System.out.println("Choose an operation: +, -, *, /");
System.out.print("Enter your choice: ");
char operation = scanner.next().charAt(0);
double result;
switch (operation) {
case '+':
result = num1 + num2;
System.out.println("Result: " + result);
break;
case '-':
result = num1 - num2;
System.out.println("Result: " + result);
break;
case '*':
result = num1 * num2;
System.out.println("Result: " + result);
break;
case '/':
if (num2 != 0) {
result = num1 / num2;
System.out.println("Result: " + result);
} else {
System.out.println("Error: Division by zero is undefined.");
}
break;
default:
System.out.println("Invalid operation.");
}
scanner.close();
}
}
