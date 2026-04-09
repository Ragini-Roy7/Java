package src.Static_Non_Static.Inheritance;

public class Vehicle {
    interface Jaguar {
        void speed();

        void mileage();
    }

    interface Car extends Jaguar {
        abstract void mileage();
    }

    static class Super_Car implements Car {
        @Override
        public void speed() {
            System.out.println("Jaguar is running");
        }

        @Override
        public void mileage() {
            System.out.println("Jaguar gives good mileage");
        }

    }

    public static void main(String[] args) {
        Super_Car c = new Super_Car();
        c.mileage();
        c.speed();
        Jaguar j= new Jaguar() {
            @Override
            public void speed() {

            }

            @Override
            public void mileage() {

            }
        };
        j.mileage();
    }

}