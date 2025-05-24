import java.util.HashMap;
import java.util.Scanner;
public class HashMapEx{
public static void main(String[] args) {
HashMap<Integer, String> students = new HashMap<>();
Scanner s = new Scanner(System.in);
System.out.print("Enter number of students: ");
int count = s.nextInt();
s.nextLine();
for (int i = 0; i < count; i++) {
System.out.print("Enter student ID: ");
int id = s.nextInt();
s.nextLine();
System.out.print("Enter student name: ");
String name = s.nextLine();
students.put(id, name);
}
System.out.print("Enter ID to search: ");
int searchId = s.nextInt();
if (students.containsKey(searchId)) {
System.out.println("Student Name: " + students.get(searchId));
} else {
System.out.println("ID not found.");
}
s.close();
}
}
