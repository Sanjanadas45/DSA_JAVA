package ASSIGNMENTS.Arrays.Easy;

public class Matrix_Subarray_Sum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            count ++;
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;
        }
        return max;
    }
}
