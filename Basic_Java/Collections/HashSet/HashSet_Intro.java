package Collections.HashSet;
import java.util.*;

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
        hs.add(456);
        System.out.println("size of hash set is: "+hs.size());
        System.out.println("elements in HashSet: "+hs);
    }
}
