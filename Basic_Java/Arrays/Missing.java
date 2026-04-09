import java.util.Arrays;
public class Missing {
    public static int findMissingInArray(int[] arr){
        int n=arr.length+1;
        //one num is missing
        boolean[] visited= new boolean[n+1];
        //visited element checked

        for(int num:arr){
            visited[num]=true;
        }
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        System.out.println("Missing number: " + findMissingInArray(arr1));

        int[] arr2 = {8, 2, 4, 5, 3, 7, 1};
        System.out.println("Missing number: " + findMissingInArray(arr2));

    }
}
