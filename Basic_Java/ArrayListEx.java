// package src.basic_array;
// package Basic_Java;
import java.util.ArrayList;


public class ArrayListEx {
    public static void main(String[] args) {
        Integer num= 40;
        System.out.println(num);
        Float nums= 6.78f;
        System.out.println(nums);

        ArrayList<Integer> n= new ArrayList<>();
        //add new elements
        n.add(67);
        n.add(64);
        n.add(56);
        System.out.println(n);

        //accessing each element from array list
        System.out.println(n.get(0));
        System.out.println(n.get(2));
        //using get() method
        //can`t use arr[0] its not array
        for(int i=0;i<n.size();i++) {
            //accessing elements from arraylist
            System.out.println("Elements present in array list are:");
            System.out.println(n.get(i));
        }
        //adding element at specific index
        n.add(1,100);
        System.out.println(n);

        //modifying values at specific index
        n.set(1,101);
        System.out.println("Elements after modifification are");
        System.out.println(n);
        //removing element values from index
        n.remove(1);
        System.out.println(n);

        //removing element without index specifying
        n.remove(Integer.valueOf(101));
        System.out.println(n);
       
         //returns boolean while printing 
        System.out.println(n.remove(Integer.valueOf(105)));
        //does not exist
        System.out.println(n);

        //if element exist
        boolean res= n.contains(67);
        System.out.println(res);
    }
    
}
