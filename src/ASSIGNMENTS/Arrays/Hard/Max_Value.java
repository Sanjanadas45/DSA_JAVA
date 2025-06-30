//Max Value of Equation
package ASSIGNMENTS.Arrays.Hard;

import java.util.ArrayDeque;
import java.util.Deque;

public class Max_Value {
    public static void main(String[] args) {
        int[][] points = {{1,3},{2,0},{5,10},{6,-10}};
        int k = 1;
        System.out.println(findMaxValueOfEquation(points, k));
    }
    public static int findMaxValueOfEquation(int[][] points, int k) {
        Deque<Integer> d = new ArrayDeque<>();
        int res = Integer.MIN_VALUE;
        for (int j = 0; j < points.length; ++j) {
            while (!d.isEmpty() && points[j][0] - points[d.peek()][0] > k)
                d.poll();
            if (!d.isEmpty())
                res = Math.max(res, points[d.peek()][1] - points[d.peek()][0] + points[j][1] + points[j][0]);
            while (!d.isEmpty() && points[d.peekLast()][1] - points[d.peekLast()][0] < points[j][1] - points[j][0])
                d.pollLast();
            d.addLast(j);
        }
        return res;
    }
}
