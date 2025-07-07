package ASSIGNMENTS.Sorting.Easy;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majority(nums));
    }
    public static int majority(int[] nums){
        int count = 0, candidate = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count += (num == candidate)? 1 : -1;
        }
        return candidate;
    }
}
