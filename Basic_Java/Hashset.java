
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Hashset{
    public static void main(String[] args) {
        //creating array list
        ArrayList<String> names= new ArrayList<>();
        names.add("Ragini");
        names.add("Shalini");
        names.add("Dipu");
        names.add("Ragini");

        Set<String> s= new HashSet<>();

        for(String str:names) {
           if(!s.add(str)) {
            System.out.println(str);
           }
        }
    }

    
}
