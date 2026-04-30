// public class Find_Index {
//     public static void main(String[] args){
//     int arr[]= {1,2,3,4,5,5};
//     //find first occurrance of specific element
//     //last occurrance of that element
//     int first_found=-1;
//     int last_found=-1;
//     int key=5;
//     //int count=0;
//     //the key value to be searched for
//     for(int i=0;i<arr.length;i++){
//          //if key is valid
//         // if(key>=0 && key<=arr.length) {
//         //     System.out.println(arr[key]);
           
//         // }
//         if(arr[i]==key){
//             first_found=i;
//         }else {
//             //keep on updating
//             last_found=i;
//         }
//          System.out.println("First Occurrence: " + first_found);
//         System.out.println("Last Occurrence: " + last_found);
//         }
//            //find duplicates 
//            System.out.println("Duplicate elements:");
//            for(int j=0;j<arr.length;j++) {
//             for(int k=j+1;k<arr.length;k++){
//             //    if(arr[j]==arr[k]) {
//             //     count++;
//             //     //duplicate found
//             //    }
//             if(arr[j]==arr[j]) {
//                 System.out.println(arr[j] + "at index"+j + "and"+k);
//             }
            
//             }
//            }
        
//     }
// }

//public class Find_Index {
//    public static void main(String[] args) {
//
//        int arr[] = {1,2,3,4,5,5};
//        int key = 5;
//
//        int firstIndex = -1;
//        int lastIndex = -1;
//
//        // find  first and last occurrence
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] == key) {
//                if(firstIndex == -1) {
//                    firstIndex = i;   // first time found
//                }
//                lastIndex = i;        // keeps updating
//            }
//        }
//
//        System.out.println("First Occurrence: " + firstIndex);
//        System.out.println("Last Occurrence: " + lastIndex);
//
//        //  duplicates
//        System.out.println("Duplicate elements:");
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = i + 1; j < arr.length; j++) {
//                if(arr[i] == arr[j]) {
//                    System.out.println(arr[i] + " at index " + i + " and " + j);
//                }
//            }
//        }
//    }
//}
