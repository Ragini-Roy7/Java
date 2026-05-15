package src.Static_Non_Static.ArrayLists;
import java.util.ArrayList;
public class Max_Ele {
    public static int max_ele(){
        ArrayList<Integer>list= new ArrayList<>();
        list.add(56);
        list.add(59);
        list.add(44);
        list.add(89);
        //using math.min()
        //uses o(n)
        int max_ele= Integer.MIN_VALUE;
         for(int i=0;i<list.size();i++) {
             max_ele= Math.max(max_ele,list.get(i));
         }
        return max_ele;
    }

    public static void main(String[] args) {
        int res= max_ele();
        System.out.println("Max ele is: "+res);

    }
}
