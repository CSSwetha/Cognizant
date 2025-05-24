import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class RecordEx{
public record Person(String name, int age) {}
public static void main(String[] args) {
List<Person> people = Arrays.asList(
new Person("Alice", 30),
new Person("Bob", 25),
new Person("Charlie", 35)
);
for (Person p : people) {
System.out.println(p);
}
List<Person> filtered = people.stream()
.filter(p -> p.age() > 30)
.collect(Collectors.toList());
System.out.println("People older than 30:");
for (Person p : filtered) {
System.out.println(p);
}
}
}
