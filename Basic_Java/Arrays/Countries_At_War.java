import java.util.Scanner;


public class Countries_At_War {
    public static int countries_at_war(int [] arr1, int [] arr2) {

        //condition both array should be equal in length
        //max power country can attack rival
        //larger num in given arr wins
        //if it is equal  return DRAW
      if(arr1.length!=arr2.length){
          System.out.println("Array must be of equal length");
          return 0;
      }
      int country1Power=0, country2Power=0;
      for(int i=0;i<arr1.length;i++){
          if(arr1[i]>arr2[i]){
              country1Power++;
          }
         else  if(arr2[i]>arr1[i]){
              country2Power++;

          }
      }
      //checking scores
        if(country1Power> country2Power){
            System.out.println("Country 1 wins");
            return 1;
        }
        else if(country2Power>country1Power){
            System.out.println("Country 2 wins");
            return 2;
        }else {
            System.out.println("DRAW");
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter size of array 1");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr_1= new int[n];

        System.out.println("Enter size of array 2");
        Scanner s= new Scanner(System.in);
        int n_2= s.nextInt();
        int[] arr_2= new int[n_2];

        System.out.println("enter elements within array 1");
        for(int i=0;i<arr_1.length;i++){
            //taking input from user
            arr_1[i]=sc.nextInt();
        }
        System.out.println("enter elements within array 2");
        for(int i=0;i<arr_2.length;i++){
            arr_2[i]=s.nextInt();
        }
       int res= countries_at_war(arr_1,arr_2);
        sc.close();

    }



}
