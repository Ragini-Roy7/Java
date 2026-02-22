public class Missing_Number_Shuffled {
   public static void main(String[]args) {
       int []arr_1= {4,8,1,3,7};
       int[]arr_2={7,4,3,1};
      
    //    boolean ele_found=false;
       //return missing element from arr_2
       for(int i=0;i<arr_1.length;i++) {
        //outer loop 
         boolean ele_found=false;
        for(int j=0;j<arr_2.length;j++) {
            //inner loop
            if(arr_1[i]==arr_2[j]) {
                ele_found=true;
                break;
            
            // }else {
            //     if(arr_1[i]!=arr_2[j])
            //     ele_found=false;
            //     //return that arr_1
            //     System.out.println(arr_1[i]);
               
            // }
            //  return ele_found;
        }
        }
        if(!ele_found){
            System.out.println( arr_1[i]);
        }
     

}
      
   }
}
 