package src.Static_Non_Static.Array_List;
import java.util.ArrayList;
//public class Array_List {
//    public static ArrayList<Integer> arr= new ArrayList<>(7);
////    arr.add(89);
//public static void main(String[] args) {
////    arr.add(6);
////    arr.add(89);
////    arr.add(35);
////    arr.add(35);
////    arr.add(56);
//    for(int i=0;i<7;i++) {
//        arr.add(6);
//        arr.add(89);
//        arr.add(35);
//        arr.add(35);
//        arr.add(56);
//        arr.remove(1);
//
//    }
//    System.out.println("Initial arrayList: "+arr);
//    System.out.println("Initial size:"+arr.size());
////    arr.remove(56);
//    System.out.println(arr);
//     //dec its size
//    arr.remove(5);
//    System.out.println("decreasing its size:");
//    //accesssing each element via for each
////    for(int n:arr){
//        //modify the existing array
//
//        //incrementing array size -> gives ConcurrentModificationException
//        //internally arrayList at runtime modifies the existing array ->dynamic memory creation
//        //Enhanced for-loop uses Iterator internally.
//        //Structural modification during iteration changes modCount.
//        //Iterator detects modification mismatch and throws ConcurrentModificationException.
//
//
////        System.out.print(n + " ");
////    }
//}
//
//}
import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        // Initial 5 elements
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println("Initial ArrayList: " + arr);
        System.out.println("Initial Size: " + arr.size());

        // Increase size from 5 -> 8
        arr.add(60);
        arr.add(70);
        arr.add(80);

        System.out.println("\nAfter Increasing Size:");
        System.out.println(arr);
        System.out.println("Size: " + arr.size());

        // Decrease size from 8 -> 3
        arr.remove(7); // removes 80
        arr.remove(6); // removes 70
        arr.remove(5); // removes 60
        arr.remove(4); // removes 50
        arr.remove(3); // removes 40

        System.out.println("\nAfter Decreasing Size:");
        System.out.println(arr);
        System.out.println("Size: " + arr.size());
    }
}