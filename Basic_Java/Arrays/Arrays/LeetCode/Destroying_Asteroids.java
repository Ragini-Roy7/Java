//package Arrays.LeetCode;
//import java.util.Arrays;
//import java.util.ArrayList;
//public class Destroying_Asteroids {
//    public static boolean calc_destroying_asteroids(int[]asteroids, int mass){
//        int new_mass=0;
//         boolean flag=false;
//         int count_true=0;
//        //we need to create an array and store those new_masses which are satisfying the condition given
//        //condition:- if mass[i]>=asteroids[i]
//        //planet destroys, planet gains mass of the asteroids
//        //asteroid is destroyed
//        //else planet is destroyed
//        for(int i=0;i<asteroids.length;i++) {
//            if ( asteroids[i]<=mass) {
//                //update new mass of planet
//                mass = asteroids[i]+mass;
//                System.out.println("new mass of " + asteroids[i] + "is: " + mass);
//                 flag=true;
//            }
//           else {
//               flag=false;
//            }
//        }
//
//
//        return flag;
//
//    }
//
//    public static void main(String[] args) {
//        int[]asteroids= {3,9,19,5,21};
//        int mass=10;
//        System.out.println(calc_destroying_asteroids(asteroids,mass));
//    }
//}
//logical bugs:- 1. we can not use the given order
//can reorder
//2.if one asteroids fails to get destroyed , return false -> means break the loop
//3.asteroids[i] > mass means mass is not greater or equal to given asteroids
//return false immediately not flag
import java.util.*;
import java.util.Arrays;
public static boolean calc_destroying_asteroids(int[]asteroids, int mass){
    //sorting the asteroids
    Arrays.sort(asteroids);

    for(int i=0;i<asteroids.length;i++){
        if(asteroids[i]>mass) {
            return false;
        }else {
            mass+=asteroids[i];
            System.out.println("updated mass at : "+asteroids[i] +" is: "+mass);
        }
    }
    return true;
}

public static void main(String[] args) {
    int[] asteroids= {3,9,19,5,21};
    int mass=10;
    System.out.println(calc_destroying_asteroids(asteroids,mass));
}