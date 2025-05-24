class Car {
String make;
String model;
int year;
void displayDetails() {
System.out.println("Car Make: " + make);
System.out.println("Car Model: " + model);
System.out.println("Car Year: " + year);
System.out.println();
}
}
public class CarTest {
public static void main(String[] args) {
Car car1 = new Car();
car1.make = "Creta";
car1.model = "SX";
car1.year = 2025;
car1.displayDetails();
Car car2 = new Car();
car2.make = "Baleno";
car2.model = "Civic";
car2.year = 2023;
car2.displayDetails();
}
}
