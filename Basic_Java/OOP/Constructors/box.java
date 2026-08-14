package Constructors;
import java.util.*;
public class box {

    int width;
    int height;
    int depth;


    box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        box my_box = new box(2, 1, 1);

        System.out.println("Volume of Box = " + my_box.volume());
    }
}