package ASSIGNMENTS.Arrays.Easy;

import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if (digits[i] < 9) {
                digits[i] ++;
                return digits;
            }
            digits[i] = 0;
        }
        // If all digits were 9, create a new array:
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
