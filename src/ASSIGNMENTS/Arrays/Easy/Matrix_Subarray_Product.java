package ASSIGNMENTS.Arrays.Easy;

public class Matrix_Subarray_Product {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        // Handle edge cases for empty or null array.Although LeetCode constraints usually specify non-empty arrays,
        // this is good practice.
        if (nums == null || nums.length == 0) {
            return 0; // Or throw an IllegalArgumentException
        }

        // 'max' will store the overall maximum product found so far.
        int max = nums[0]; // Initialize with the first element.

        // 'currentMaxProd' will track the maximum product of a subarray ending at the current index.
        int currentMaxProd = nums[0];

        // 'currentMinProd' will track the minimum product of a subarray ending at the current index.
        // This is essential because multiplying a negative number by a negative 'currentMinProd'
        // can result in a new, larger positive product.
        int currentMinProd = nums[0];

        // Iterate from the second element of the array
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // To correctly calculate the new currentMaxProd and currentMinProd,
            // we need the values of currentMaxProd *before* it's updated.
            // So, we temporarily store the currentMaxProd.
            int tempMaxProd = currentMaxProd;

            // Calculate the new currentMaxProd:
            // It can be either the current number itself (starting a new subarray),
            // or the product of the current number and the previous max product,
            // or the product of the current number and the previous min product (important for negatives).
            currentMaxProd = Math.max(num, Math.max(tempMaxProd * num, currentMinProd * num));

            // Calculate the new currentMinProd:
            // Similarly, it can be the current number itself,
            // or the product of the current number and the previous max product (`tempMaxProd`),
            // or the product of the current number and the previous min product.
            currentMinProd = Math.min(num, Math.min(tempMaxProd * num, currentMinProd * num));

            // Update the overall maximum product found so far.
            max = Math.max(max, currentMaxProd);
        }

        return max;
    }
}
