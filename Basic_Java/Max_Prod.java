
public class Max_Prod {
 public static void main(String[] args){
    int []arr= {1,4,3,6,7,0};
    int max_prod=Integer.MIN_VALUE;
    int prod=0;

    for(int i=0;i<arr.length-1;i++) {
        for(int j=i+1;j<arr.length;j++) {
            prod= arr[i]*arr[j];
           if(prod>max_prod) {
            max_prod=prod;
           }
        }
    }

System.out.println("Max prod is "+max_prod);
 }
    
}
