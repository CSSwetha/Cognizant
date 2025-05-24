import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEx{
public static void main(String[] args){
ArrayList<String> students = new ArrayList<>();
Scanner s = new Scanner(System.in);
System.out.print("Enter number of students: ");
int count = s.nextInt();
s.nextLine();
for (int i = 0; i < count; i++) {
System.out.print("Enter student name: ");
String name = s.nextLine();
students.add(name);
}
System.out.println("Student names:");
for (String student : students) {
System.out.println(student);
}
s.close();
}
}
