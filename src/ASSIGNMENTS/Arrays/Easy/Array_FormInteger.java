//Add to Array-Form of Integer
package ASSIGNMENTS.Arrays.Easy;
import java.util.LinkedList;
import java.util.List;

public class Array_FormInteger {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(num, k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new LinkedList<>();
        for (int i = num.length - 1; i >= 0; --i) {
            res.addFirst((num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0) {
            res.addFirst(k % 10);
            k /= 10;
        }
        return res;
    }
}
