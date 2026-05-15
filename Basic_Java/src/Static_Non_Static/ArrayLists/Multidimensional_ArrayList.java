package src.Static_Non_Static.ArrayLists;
import java.util.ArrayList;
public class Multidimensional_ArrayList {
    public static void main(String[] args) {


        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(31);
        list.add(88);
        list.add(45);
        list.add(89);
        System.out.println(list);
    //another arraylist
        ArrayList<Integer> list_sec= new ArrayList<>();
        list_sec.add(83);
        list_sec.add(53);

        mainList.add(list);
        mainList.add(list_sec);
        for(int i=0;i< mainList.size();i++){
            ArrayList<Integer> currentList= mainList.get(i);
            for(int j=0;j<currentList.size();j++) {
                System.out.println(currentList.get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}