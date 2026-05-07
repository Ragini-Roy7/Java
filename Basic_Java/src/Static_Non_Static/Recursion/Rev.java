package src.Static_Non_Static.Recursion;

public class Rev {
   public static void rev_arr(){
      int[] arr= {1,2,3,4,5};

         for(int i=arr.length-1;i>=0;i--){
             System.out.print(arr[i] + " ");
         }
     }

    public static void main(String[] args) {
        rev_arr();
    }
 }

