package src.Static_Non_Static.Inheritance;
//hierarchical inheritance
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MyClass {
    public static void main(String[] args) {

        Dog lily = new Dog();
        Cat milly = new Cat();

        lily.sound();   // Dog barks
        milly.sound();  // Cat meows
    }
}