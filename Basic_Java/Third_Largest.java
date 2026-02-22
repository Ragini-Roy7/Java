public class Third_Largest {
    public static void main(String[] args){
        int [] arr={2,4,1,3,5};
        int prev_max=arr[0];
        int prev_max_index=-1;
   
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>prev_max){
                prev_max=arr[i];
                prev_max_index=i;
                System.out.println(prev_max);
                System.out.println(prev_max_index);
            }
            //skip this first_max_index
        }
        //update max
        int curr_max=arr[0];
        int curr_max_index=-1;
        for(int j=0;j<arr.length;j++) {

           if(j==prev_max_index) {
            continue;
           }
           if(arr[j]>curr_max) {
            curr_max=arr[j];
            curr_max_index=j;

            System.out.println(arr[j]);
            System.out.println(j);
           }

        }
      //last max
      int last_max= arr[0];
      for(int k=0;k<arr.length;k++){
        if(k==curr_max_index || k==prev_max_index) {
            continue;
        }
        if(arr[k]>last_max) {
            last_max=arr[k];
           
            System.out.println("Final output is"+last_max + "at "+k);
        }
      }
    }
    
} 
