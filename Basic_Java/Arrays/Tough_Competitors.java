import java.util.Arrays;
public class Tough_Competitors {

    public static void main(String[] args) {
        int [] arr= {9,4,12,6};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            //using bubble sort
            boolean isSwapped=false;
           for(int j=0;j<n-i-1;j++){
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   isSwapped=true;
               }

           }
           if(!isSwapped){
              break;
           }
        }
        System.out.println(Arrays.toString(arr));
        int result = tough_competitors(arr);
        System.out.println("Minimum difference = " + result);
    }
   static int tough_competitors(int[] arr) {
        int min_diff= Math.abs(arr[0]-arr[1]);
        //intializting min_diff
//       int min_diff = 0;
       for (int i = 0; i < arr.length - 1; i++) {
           int diff = Math.abs(arr[i] - arr[i + 1]);
           System.out.println(  "Difference between " + arr[i] + " and " + arr[i + 1] + " = " +diff);

           if(diff<min_diff){
               min_diff=diff;
           }


       }
       return min_diff;
   }

}
