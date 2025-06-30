//How Many Numbers Are Smaller Than the Current Number
package ASSIGNMENTS;
import java.util.Arrays;
import java.util.Scanner;

public class Smaller_Current {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
