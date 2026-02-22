// public class Element_Odd_Occurances {
    
//     public static void main(String[] args){
//         int [] arr= {7,1,2,3,4,5,6};
//         int count=0;


//         for (int i = 0; i < arr.length; i++) {
//             count = 0;
//             for (int j = 0; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                 }
//             }
//             if (count % 2 != 0) {
//                 System.out.println(arr[i]);
//             }
//         }
//     }

// }
class Element_Odd_Occurances { 
        
    public int getOddOccurrence(int[] arr) {
        
        
        int xor = 0;
        
        for(int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        
        return xor;
    }
  
}
