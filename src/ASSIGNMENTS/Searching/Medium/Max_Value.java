//Maximum Value at a Given Index in a Bounded Array
package ASSIGNMENTS.Searching.Medium;

//Approach
//We first do maxSum -= n,
//then all elements needs only to valid A[i] >= 0
//
//We binary search the final result between left and right,
//where left = 0 and right = maxSum.
//
//For each test, we check minimum sum if A[index] = a.
//The minimum case would be A[index] is a peak in A.
//It's arithmetic sequence on the left of A[index] with difference is 1.
//It's also arithmetic sequence on the right of A[index] with difference is -1.
//
//On the left, A[0] = max(a - index, 0),
//On the right, A[n - 1] = max(a - ((n - 1) - index), 0),
//
//The sum of arithmetic sequence {b, b+1, ....a},
//equals to (a + b) * (a - b + 1) / 2.

public class Max_Value {
    public static void main(String[] args) {
        int n = 4, index = 2,  maxSum = 6;
        System.out.println(maxValue(n, index, maxSum));
    }
    public static int maxValue(int n, int index, int maxSum) {
        maxSum -= n;
        int left = 0, right = maxSum, mid;
        while (left < right) {
            mid = (left + right + 1) / 2;
            if (test(n, index, mid) <= maxSum)
                left = mid;
            else
                right = mid - 1;
        }
        return left + 1;
    }

    private static long test(int n, int index, int a) {
        int b = Math.max(a - index, 0);
        long res = (long)(a + b) * (a - b + 1) / 2;
        b = Math.max(a - ((n - 1) - index), 0);
        res += (long)(a + b) * (a - b + 1) / 2;
        return res - a;
    }
}
