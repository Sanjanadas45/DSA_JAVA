//Return maximum product of three numbers
package ASSIGNMENTS.Sorting.Easy;
import java.util.Arrays;

public class Max_Prod {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(maxProd(nums));
    }
    public static int maxProd(int[] nums){
        Arrays.sort(nums);
        // Returns the maximum product of any three numbers: either the product of the three largest numbers
        // or the product of the two smallest (possibly negative) numbers and the largest number.
        return Math.max(
                nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3],
                nums[0] * nums[1] * nums[nums.length - 1]
        );
    }
}
