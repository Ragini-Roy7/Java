package Stack;
//brute force approach
public class Next_Greater_Ele {
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 10};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean found = false;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] > arr[i]) {
                    System.out.println(arr[j]);
                    found = true;
                    break; // important
                }
            }

            if (!found) {
                System.out.println(-1);
            }
        }
    }
}

