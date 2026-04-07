package Collections;
import java.util.ArrayList;
import java.util.*;
//without importing util library , java does convert it into ArrayList of object
//using Array List of String
public class ArrayList_Intro {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Geeta");
        list.add("Anaya");
        System.out.println("name of students enrolled in soccer arena");
        for(String name: list){
            System.out.println(name);
        }
    }


}
