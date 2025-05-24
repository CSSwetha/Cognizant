import java.util.Scanner;
import java.util.Random;
public class NumberGuessing{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
Random random = new Random();
int target = random.nextInt(100) + 1;
int guess = 0;
int attempts = 0;
System.out.println("Welcome to the Number Guessing Game!");
System.out.println("Guess a number between 1 and 100:");
while (guess != target){
System.out.print("Enter your guess: ");
guess = scanner.nextInt();
attempts++;
if (guess < target){
System.out.println("Too low! Try again.");
}else if (guess > target){
System.out.println("Too high! Try again.");
} else {
System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
}
}
scanner.close();
}
}
