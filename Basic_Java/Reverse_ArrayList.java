
import java.util.ArrayList;
import java.util.Collections;

public class Reverse_ArrayList {
    static void reverseList(ArrayList<Integer>list) {
 //using swapping
 //updating to next element if i<j
    int i=0,j= list.size()-1;
    while(i<j) {
        //temp= a
        // a=b
        // b=temp
        Integer temp= list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
        i++;
        j--;
    }


    }
    public static void main(String[] args) {
        //creating arrayList
    ArrayList<Integer> list= new ArrayList<>();
    list.add(83);
    list.add(53);
    list.add(64);
    list.add(89);
    list.add(99);
    list.add(77);
    System.out.println("Original list:"+list);
    reverseList(list);
    System.out.println("Reverse list: "+list);
    //using collections
    Collections.reverse(list);
    System.out.println("reversed list: "+list);
       
    //sorting using collection
    Collections.sort(list);
    System.out.println("ascending order: "+list);
    Collections.sort(list,Collections.reverseOrder());

    }

    
}
