package src.Static_Non_Static.ArrayLists;
import java.util.ArrayList;
public class Swap {
    //swap with given index val
    public static void swap(ArrayList<Integer>list,int index_1,int index_2){
        int temp= list.get(index_1);
        list.set(index_1,list.get(index_2));
        list.set(index_2, temp);

    }
    public static void main(String args[]) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int index_1=1, index_2=3;
        System.out.println("org list: "+list);
        System.out.println("swapped list:");
   swap(list,index_1,index_2);
        System.out.println(list);


    }


}
