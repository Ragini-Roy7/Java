//incomp
public class Alternative_Sorting {
    public static void main(String[] args) {
        int[] arr= {7,1,2,3,4,5,6};
        //naive
        int max_element=arr[0];
        int max_ele_index=0;
        for(int i=0;i<arr.length;i++) {
            if(max_element<arr[i]) {
                max_element=arr[i];
                max_ele_index=i;
                
            }
            System.out.println("First max element found at "+arr[i] + i);
            //jis bhi element par maximum ele mila use skip kar do iteration se
        //     //max_element ki index value
        //   for(int j=0;j<arr.length;j++) {
        //     if(i==max_ele_index) {
        //         continue;
        //     }
        //     else {
        //         if(max_element<arr[i]) {
        //             //update max element
        //             max_element=arr[i];
        //             max_ele_index=i;
        //         }
        //     }
        //   }
        int secondMax=Integer.MIN_VALUE;
        int secondMaxIndex=-1; 
        for(int j=0;j<arr.length;j++) {
            if(j==max_ele_index) {
                continue;

            }
            if(arr[j]>secondMax) {
                secondMax=arr[j];
                secondMaxIndex=j;
            }
        }
          System.out.println("second max:"+secondMax + "at index "+secondMaxIndex);

           

        }


    }
    
}
