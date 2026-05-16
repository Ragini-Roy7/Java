package src.Static_Non_Static.ArrayLists;
import java.util.ArrayList;
public class Max_Water_Container {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        //brute-> not optimal
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int heightOfWater= Math.min(height.get(i),height.get(j));
                int widthOfWater=j-i;
                int currentWater= heightOfWater*widthOfWater;
                maxWater= Math.max(maxWater, currentWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));


    }
}