package src.Static_Non_Static.Inheritance;
import java.io.*;
public class Multiple_Inheritance {
    //declaring a parent class
    interface Animal{
        void sound();

    }
    interface Animal2{
        void soundAnimal2();
    }

    static class Dog implements Animal, Animal2{
        @Override
        public void sound(){
            System.out.println("Dog is barking within interface");
        }
       @Override
        public void soundAnimal2(){
            System.out.println("Dog is barking within interface 2");
        }


    }

    public static void main(String[] args) {
        //creating objects
        Dog my_dog= new Dog();
        my_dog.sound();
        my_dog.soundAnimal2();
    }
    }



