//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
package ASSIGNMENTS.Searching.Easy;
import java.lang.Math;

public class Sqrt {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        double result = Math.abs(Math.sqrt(x));
        return (int) result;
    }
}
