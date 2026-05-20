//package Arrays.LeetCode;
//import java.util.*;
//public class MostFrequent_Even_Ele {
//    public static int most_freq_even_ele(int[]arr) {
////        //int count;
//        for (int i = 0; i < arr.length; i++) {
//            //check if arr[i] is even
//            int count = 0;
//            if (arr[i] % 2 == 0) {
//                //count no of even elements and return smallest even ele in numbers
//                count++;
//            }
//            if (count[i] > count[i + 1]) {
//                //use integer max() fn
//                //compare value of count ele then return min()fn
//            }
//            //compare count of each ele
//
//        }
//    }
//
//    public static void main(String[] args) {
//        int[]arr= {0,1,2,2,4,4,1};
//        int res= most_freq_even_ele(arr);
//        System.out.println(res);
//
//    }
//}

package Arrays.LeetCode;
import java.util.*;
//using hashmaps

public class MostFrequent_Even_Ele {

    public static int most_freq_even_ele(int[] arr) {

        Map<Integer, Integer> freq = new HashMap<>();

        // counting frequencies of even elements
        for (int num : arr) {
            if (num % 2 == 0) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
        }

        int maxFreq = 0;
        int answer = -1;

        // find most frequent (tie → smallest)
        for (int key : freq.keySet()) {
            int count = freq.get(key);

            if (count > maxFreq || (count == maxFreq && key < answer)) {
                maxFreq = count;
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,4,4,1};
        int res = most_freq_even_ele(arr);
        System.out.println(res); // 2
    }
}
