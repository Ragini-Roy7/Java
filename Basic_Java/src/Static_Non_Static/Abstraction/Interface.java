package src.Static_Non_Static.Abstraction;
import java.io.*;
  interface  Shape{
    double calcArea();
}

class Circle implements Shape{
    public double radius;
    public Circle(double rad){
        //instantiating using radius
        this.radius=rad;
    }
    //implementing abstract method from CalcArea
    public double calcArea(){
        return Math.PI*radius*radius;
    }
}
class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //implementing abstract method from Interface class
    public double calcArea() {
        return length * width;
    }


    public static void main(String[] args) {
        Circle circle = new Circle(9.8);

        Shape rect=new Rectangle(4.5, 6.7);
        System.out.println("area of circle: " + circle.calcArea());
        System.out.println("area of rect: " + rect.calcArea());
    }
}