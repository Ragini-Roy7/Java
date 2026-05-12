public class Prefix_Sum {
    public static int prefix_sum(int[] arr){
        //o(n)
        //using single loop
        int length=arr.length;
        int i = 0,sum=0;
        for(int n=1; i<length;i++){
            sum= arr[i-1]+arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr= {6,3,-2,4,-1,0,-5};
        int res= prefix_sum(arr);
        System.out.println(res);
    }
}
