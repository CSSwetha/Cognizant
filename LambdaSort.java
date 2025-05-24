import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class LambdaSort {
public static void main(String[] args) {
List<String> n = new ArrayList<>();
n.add("Alice");
n.add("Charlie");
n.add("Bob");
Collections.sort(n, (a, b) -> a.compareTo(b));
for (String name : n) {
System.out.println(name);
}
}
}
