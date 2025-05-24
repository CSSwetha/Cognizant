import java.lang.reflect.Method;
public class ReflectionExample {
public void greet(String name) {
System.out.println("Hello, " + name);
}
public static void main(String[] args) throws Exception {
Class<?> cls = Class.forName("ReflectionExample");
Object obj = cls.getDeclaredConstructor().newInstance();
Method[] methods = cls.getDeclaredMethods();
for(Method method : methods) {
System.out.println("Method: " + method.getName());
Class<?>[] paramTypes = method.getParameterTypes();
for(Class<?> param : paramTypes) {
System.out.println("Parameter: " + param.getName());
}
if(method.getName().equals("greet")) {
method.invoke(obj, "World");
}
}
}
}
