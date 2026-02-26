package Arrays;
import java.util.Arrays;

public class Atleast_Two_Greater {
    public static void main(String[] args) {
        int arr[]= {2,8,7,1,5};
        int max=arr[0];
        int max_el=0;
        int sec_max=arr[0];
        int sec_max_el=0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max){
                max=arr[i];
                max_el=i;
            }
        }
        //skip iteration where max is
        for(int i=0;i<arr.length;i++) {
            if(i==max_el) {
                continue;
            }
            //now find sec max
            if(arr[i]>sec_max) {
                sec_max=arr[i];
                sec_max_el=i;
            }
//            if(arr[i]== max && arr[i]==sec_max) {
                //return
//               System.out.println(arr[i]);
                //apply sorting
//                Arrays.sort(arr,max_el, sec_max_el);
//                System.out.println(Arrays.toString(arr));



        }
        System.out.println(max);
        System.out.println(sec_max);





    }
}
