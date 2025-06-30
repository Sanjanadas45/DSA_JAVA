//Concatenation of Array
package ASSIGNMENTS.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Array_concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(concat(arr)));
    }
    public static int[] concat(int[] nums){
        int[] n = new int[nums.length];
        int[] ans = new int[2 * n.length];
        for (int i = 0; i < n.length; i++) {
            ans[i] = nums[i];
            ans[i + n.length] = nums[i];
        }
        return ans;
    }
}
//  In Java, when you try to print an array directly using System.out.println(array), you will see output like [I@15db9742 instead of the actual elements of the array.
//  This is because, by default, arrays do not override the toString() method from Object, so you get the object's memory address rather than its contents.
//  The Arrays.toString(array) method (from java.util.Arrays) converts the array into a readable string format, like [1, 2, 3, 4],
//  which shows all the elements in the array. That's why you should use Arrays.toString()
//  when you want to print the contents of an array in the main method (or anywhere else).
