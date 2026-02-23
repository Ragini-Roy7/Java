package Basic_Java;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args){
        HashSet<Integer> set= new HashSet<>();

        set.add(10);
        set.add(90);
        set.add(89);
        set.add(89);
        System.out.println(set);

        //remove function
        set.remove(89);
        System.out.println("89 removed");
        System.out.println(set);
//iterator
        Iterator it= set.iterator();
        System.out.println(it);
        //set.iterator() returns iterator object
        //traverse elements of HashSet
        //prints default toString() representation of obj
        //Since Iterator doesn’t override toString(), you just see the class name (java.util.HashMap$KeyIterator) plus its memory reference hash.

//print its elements
        Iterator <Integer> i= set.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        Iterator <Integer> r= set.iterator();
        while(r.hasNext()) {
            System.out.println(r.next());
        }

    }
}
