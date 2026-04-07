package OOP.vehicle;

import OOP.Vehicle;

public class Bike extends Vehicle {

    void showSpeed() {
        speed = 100;        // ✅ accessible because protected
        System.out.println("Speed of Vehicle is "+ speed);
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.showSpeed();
    }
}
