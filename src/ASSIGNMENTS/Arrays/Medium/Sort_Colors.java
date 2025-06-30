package ASSIGNMENTS.Arrays.Medium;

public class Sort_Colors {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int tmp = nums[low];
                nums[low++] = nums[mid];
                nums[mid++] = tmp;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int tmp = nums[mid];
                nums[mid] = nums[high];
                nums[high--] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 1, 2, 0, 1};
        sortColors(nums);
    }
}
