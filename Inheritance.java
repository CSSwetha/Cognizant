class Animal {
void makeSound() {
System.out.println("Animal makes a sound");
}
}
class Dog extends Animal {
@Override
void makeSound() {
System.out.println("Bark");
}
}
public class Inheritance {
public static void main(String[] args) {
Animal a = new Animal();
a.makeSound();  
Dog dog = new Dog();
dog.makeSound(); 
}
}
