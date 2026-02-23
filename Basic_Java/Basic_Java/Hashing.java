package Basic_Java;
import java.util.HashSet;

public class Hashing {
    public static void main(String[] args){
        HashSet<Integer> set= new HashSet<>();

        set.add(10);
        set.add(90);
        set.add(89);
        System.out.println(set);

        //remove function
        set.remove(89);
        System.out.println("89 removed");

    }
}
