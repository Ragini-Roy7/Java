package src.Static_Non_Static.Recursion;

public class Find_Occurrences_Key {
    public static void find_occurrences_of_key(int[] arr,int i, int key){
        if(i==arr.length){
            return;
        }
        //recursive fn
        if(arr[i]==key){
            System.out.print(i + " ");
        }
        // recursive call (ALWAYS go ahead)
     find_occurrences_of_key(arr,i+1,key);
    }

    public static void main(String[] args) {
        int[] arr= {3,2,4,5,6,2,7,2,2,3};
        int key=2;
        find_occurrences_of_key(arr,0,key);
    }
}
