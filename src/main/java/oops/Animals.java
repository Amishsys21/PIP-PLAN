package main.java.oops;

public interface Animals {
        void makeSound();
    }

class Cat implements Animals{
    public void makeSound() {
        System.out.println("Meow!");
    }
}
class Dogs implements Animals {
    public void makeSound() {
        System.out.println("Woof!");
    }
}


