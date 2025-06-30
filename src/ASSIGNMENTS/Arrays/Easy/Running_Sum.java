//Running Sum of 1d Array
package ASSIGNMENTS.Arrays.Easy;
import java.util.Arrays;
import java.util.Scanner;

public class Running_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        if (nums.length == 0){
            return runningSum;
        }
        runningSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) { //iterating from second element that is why loop starts from index = 1.
            runningSum[i] = runningSum[i - 1] + nums[i];
        }
        return runningSum;
    }
}
