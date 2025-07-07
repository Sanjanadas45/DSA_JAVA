package ASSIGNMENTS.Sorting.Easy;

public class Missing_Number {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missing(nums));
    }
    public static int missing(int[] nums){
        int result = nums.length;
        for(int i = 0; i < nums.length; i++){
            //Update result
            result += i - nums[i]; //For each iteration, res is updated by adding the difference between the current index i and the value nums[i].
            // This essentially accumulates the differences between the indices and the corresponding numbers in the array.
        }
        return result;
    }
}
