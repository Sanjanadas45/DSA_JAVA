//Largest Perimeter Triangle

//Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths.
// If it is impossible to form any triangle of a non-zero area, return 0.

package ASSIGNMENTS.Sorting.Easy;
import java.util.Arrays;

public class Triangle_Perimeter {
    public static void main(String[] args) {
        int[] nums = {2,3,4};
        System.out.println(perimeter(nums));
    }
    public static int perimeter(int[] nums){
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 1; i--) {
            if(nums[i] < nums[i - 1] + nums[i - 2]){
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }
}
