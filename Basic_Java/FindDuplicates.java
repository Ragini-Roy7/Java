import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 1};
//creating hashset
        HashSet<Integer> set = new HashSet<>();
//using for each loop
//checking if num exists in set
        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("Duplicate element: " + num);
            } else {
                set.add(num);
            }
        }
    }
}
