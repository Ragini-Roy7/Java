public class Max_Element {
    public static void main(String[] args){
        
        int[] arr= {102,2,4,5,6};
        int n=arr.length;
        int max_element= arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max_element){
                arr[i]= max_element;
                System.out.println(arr[i]);
            }

        }
    }
}
