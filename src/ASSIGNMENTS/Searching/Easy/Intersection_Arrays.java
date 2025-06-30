//Given two integer arrays nums1 and nums2,
// return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
//RECOMMENDED FOR INTERVIEWS
package ASSIGNMENTS.Searching.Easy;
import java.util.Arrays;
import java.util.ArrayList;

public class Intersection_Arrays {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 2, 1}, num2 = {2, 2};
        System.out.println(Arrays.toString(intersection(num1, num2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                // Avoid duplicates
                if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                    result.add(nums1[i]);
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        // Convert ArrayList to array
        int[] res = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            res[k] = result.get(k);
        }
        return res;
    }
}

//For intersection of arrays II, duplicates will be calculated.
