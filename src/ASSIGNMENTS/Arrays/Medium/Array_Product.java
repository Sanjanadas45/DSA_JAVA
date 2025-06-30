//Product of Array Except Self
package ASSIGNMENTS.Arrays.Medium;

import java.util.Arrays;

public class Array_Product {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
        public static int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int answer[] = new int[n];
            // Step 1: Calculate prefix products
            answer[0] = 1;
            for (int i = 1; i < n; i++) {
                answer[i] = answer[i - 1] * nums[i - 1];
            }

            // Step 2: Calculate suffix products and multiply with prefix
            int suffix = 1;
            for (int i = n - 1; i >= 0; i--) {
                answer[i] *= suffix;
                suffix *= nums[i];
            }

            return answer;
        }
}
