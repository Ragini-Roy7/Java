package src.Static_Non_Static.Recursion;

public class First_Occurence {
    public static int first_occurrence(int[] arr, int i, int target) {
        if (i == arr.length ) {
            return -1;
        }


//        if (arr[i] != target) {
//            //this does not iterate over other elements
        //causing recursion not to move forward so only return when match is found
//            return -1;
//        }
        if (arr[i] == target) {
            return i;
        }
        //moving towards next iteration
       return  first_occurrence(arr, i + 1,target);
    }

        public static void main (String[]args){
            int[] arr = {1, 12, 22, 10,3, 2};
            int target=2;
          int res=(first_occurrence(arr, 0,target));
          if(res==-1){
              System.out.println("Reached end of array.No matches found\n");
          }
          else{
              System.out.println("First occurrence of element  : "+ target +  " is at  " +"index: "+res);
          }
        }
    }
