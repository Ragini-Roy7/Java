package Arrays.LeetCode.sorting;
import java.util.*;
public class top_k_ele {
    public  static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Frequency map
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min heap based on frequency
        PriorityQueue<Integer> heap =
                new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));

        for (int num : freq.keySet()) {
            heap.offer(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // Step 3: Extract result
        int[] result = new int[k];
        int i = 0;
        for (int num : heap) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums= {8,9,8,7,7};
        int k =2;
        System.out.println(topKFrequent(nums,k));
    }
}
