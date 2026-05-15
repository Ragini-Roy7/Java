package src.Static_Non_Static.ArrayLists;
import java.util.ArrayList;
public class ArrayLists_Intro {
    public  static ArrayList<Integer> ArrayListPrint() {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(676);
        list.add(643);
        list.add(676);
        list.add(2,68); //o(n)
        list.remove(1);

        System.out.println("size of arraylist : "+list.size());
        for(int i=0;i<list.size();i++){
            //accessing ele using get
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        return list;
    }
  public static ArrayList<String> StringListPrint() {
        ArrayList<String> list= new ArrayList<>();
        list.add("Ram");
        list.add("Geeta");
        list.add("Mohan");
        list.add("Sohan");
        list.add("Shyam");
        list.remove(1);
        return list;
  }

  //note:- read about ConcurrentMethodException
    public static void main(String[] args) {
        ArrayList<Integer> arraylist= ArrayListPrint();
        ArrayList<String> string_list= StringListPrint();
        System.out.println(arraylist);
        System.out.println(string_list);
        System.out.println(string_list.get(2));
        //using set func
        string_list.set(3,"Ramisha");
        System.out.println("Updated string arraylist :"+string_list);
        //contains
        System.out.println(string_list.contains("Ram"));

    }
}
