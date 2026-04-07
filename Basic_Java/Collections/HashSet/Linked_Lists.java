package HashSet;
import java.util.LinkedList;

public class Linked_Lists {
    public static void main(String[] args) {
        LinkedList<String> l= new LinkedList<>();
        l.add("ram");
        l.add("shyam");
        l.add("geeta");
        l.add(3,"enrolled in Soccer Arena");
        System.out.println(l);
        System.out.println("Updated LinkedList "+l);
        l.set(3, "at college");
        System.out.println("Updated info: "+l);
        //iteration
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        System.out.println();
    }
}
