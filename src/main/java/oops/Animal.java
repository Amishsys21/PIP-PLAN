package main.java.oops;
//Example of Inhertiance.
public class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println("Name: " + dog.getName());
        dog.eat();
        dog.bark();
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Woof!");
    }
}
