package Stack;
import java.util.*;

public class NextGreater_Lc {
    public static int[] nge(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10};
        int[] ans = nge(arr);

        System.out.println(Arrays.toString(ans));
    }
}