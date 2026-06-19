public static int[] plusOne(int[] digits) {

    int n = digits.length;

    // least significant digit
    for (int i = n - 1; i >= 0; i--) {

        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }

        // digit is 9 so make it 0 and continue carry
        digits[i] = 0;
    }

    // if all digits were 9
    int[] result = new int[n + 1];
    result[0] = 1;
    return result;
}

public static void main(String[] args) {
    int[] digits= {1,2,3};
    System.out.println(Arrays.toString(plusOne(digits)));



}
