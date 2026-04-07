package Collections.HashSet;
import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.Integer;

public class HashSet_Intro {
    public static void main(String[] args) {
        HashSet<Integer>hs= new HashSet<>();
        //hashSet implements set interface of java collections
        //does not follow insertion order
        //implements serializable and cloneable interfaces
        //does not support primitive types, requires wrapper class
        //synchronization needed to make it thread safe
        hs.add(456);
        hs.add(678);
        hs.add(454);
        System.out.println("size of hash set is: "+hs.size());
        System.out.println("elements in HashSet: "+hs);

        //removing elements in hashset
        hs.remove(456);
        System.out.println("Removed element from hashset is : "+hs);

        //iterating through hashset
        Iterator<Integer> iterator= hs.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(hs.isEmpty()); //false
        System.out.println(hs.clone());
        System.out.println(hs.contains(678 ));
        System.out.println(hs.add(788));
//        while(!iterator.hasNext()){
//            System.out.println("empty");
//        }
        System.out.println();
        //printing elements via for each
        for(Integer element : hs){
            System.out.println(element);
        }

    }
}
