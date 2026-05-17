////expected approach - using partition
//public class Median_TwoSortedArr_Op {
//    public static int median_two_sorted(int arr_1, int arr_2) {
//     //calling private func 1
//
//    }

//    private static int left_partition(int[] arr_1, int[] arr_2) {
//        //find mid
//        int i = 0, j = 0, k = 0;
//        while (arr_1.length <= arr_2.length) {
//            if (arr_1[i] <= arr_2[j]) {
//                arr_1[i] = arr_2[k++];
//            }
//        }
//        return arr_1[i];
//
//    }   //creating another helper func
//        private static int right_partition ( int[] arr_1, int[] arr_2){
//            int i = 0, j = 0, k = 0;
//            while (arr_2.length >= arr_1.length) {
//                if (arr_2[j] >= arr_2[i]) {
//                    arr_2[j] = arr_1[k++];
//
//                }
//            }
//return arr_2[j];
//
//        }

//    public static void main(String[] args) {
//
//    }
//    }



    public static double findMedian(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedian(nums2, nums1);
        }

        int n1 = nums1.length;
        int n2 = nums2.length;

        int low = 0, high = n1;

        while (low <= high) {

            int cut1 = (low + high) / 2;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            int L1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int R1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];

            int L2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int R2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];

            if (L1 <= R2 && L2 <= R1) {

                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
                } else {
                    return Math.max(L1, L2);
                }
            }

            else if (L1 > R2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};

        System.out.println(findMedian(nums1, nums2));
    }
