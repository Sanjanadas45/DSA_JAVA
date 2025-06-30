//Find Numbers with Even Number of Digits
package ASSIGNMENTS.Arrays.Easy;

import java.util.Scanner;

public class Even_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int evencount = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int n = Math.abs(nums[i]); //handles negative number
            if(n == 0) count = 1;
            while(n > 0){
                count++;
                n = n / 10;
            }
            if(count % 2 == 0) {
                evencount++;
            }
        }
        return evencount;
    }
}
