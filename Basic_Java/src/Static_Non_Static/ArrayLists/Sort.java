package src.Static_Non_Static.ArrayLists;
import java.util.ArrayList;
import java.util.Collections;
public class Sort {
    public static void arrayList(){
        ArrayList<Integer> l= new ArrayList<>();
        l.add(5);
        l.add(7);
        l.add(3);
        l.add(-1);
        l.add(0);
        System.out.println("initial list: "+l);
        Collections.sort(l);
        System.out.println("sorted list: "+l);
        //descending
        //comparators in java defines method to implement some functions within it

        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);

    }

    public static void main(String[] args) {
//        ArrayList<Integer> l= new ArrayList<>();
//        System.out.println(arrayList(l.get(i)));
        arrayList();
    }

}
