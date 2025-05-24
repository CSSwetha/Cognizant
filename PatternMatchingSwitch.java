public class PatternMatchingSwitch {
public static void main(String[] args) {
printTypeInfo(42);
printTypeInfo("Hello");
printTypeInfo(3.14);
printTypeInfo(true);
}

public static void printTypeInfo(Object o) {
switch (o) {
case Integer i -> System.out.println("Integer: " + i);
case String s -> System.out.println("String: " + s);
case Double d -> System.out.println("Double: " + d);
case Boolean b -> System.out.println("Boolean: " + b);
default -> System.out.println("Unknown");
}
}
}
