import java.util.Arrays;
public class Perfect_Sum_Problem {
    public static void main(String[] args) {
//        System.out.println("h");
        int[] arr = {5, 2, 3, 10, 6, 8};
        //given input
        int arr_1 = arr.length / 2; //{5,2,3}=3
        int arr_2 = arr.length / 2; //{10,6,8} =3
        int target=10;
        int mid=arr.length/2; //3
        int count=0;

        //generate possible subsets from both the subsets

        //approach :- add each subset and match it to target
        //if sum of all elements from given subset > target
        //do not consider
        //2*n = 2*3=2*2*2

        for (int i = 0; i < Math.pow(2, arr_1); i++) {
            int sum_1 = 0;
            {
                for(int j=0;j<arr_1;j++){

                    if((i/(int)Math.pow(2,j))%2==1){

                        sum_1+=arr[j];
                    }
                    if(sum_1==target){
                      count++;
                    }

                }
            }

            }
        for(int i=0;i<Math.pow(2,arr_2);i++){
            int sum_2=0;

            for(int j=0;j<arr_2;j++){
                if((i/(int)Math.pow(2,j))%2==1){

                    sum_2+=arr[j];
                }
             if(sum_2==target)
                 count++;

            }
        }
        System.out.println("total no of subsets equal to "+ target+ "is :"+count);

        }


    }