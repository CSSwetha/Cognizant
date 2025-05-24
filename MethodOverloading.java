public class MethodOverloading{
public static int add(int a, int b){
return a + b;
}
public static double add(double a, double b){
return a + b;
}
public static int add(int a, int b, int c){
return a + b + c;
}
public static void main(String[] args){
int sum1 = add(11, 99);               
double sum2 = add(8.6, 7.8);         
int sum3 = add(56, 81, 92);             
System.out.println("Sum of two integers (11 + 99): " + sum1);
System.out.println("Sum of two doubles (8.6 + 7.8): " + sum2);
System.out.println("Sum of three integers (56 + 81 + 92): " + sum3);
}
}
