//Write a function that returns the sum of first n natural numbers.
package ASSIGNMENTS;
import java.util.Scanner;

public class Natural_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit: ");
        int n = sc.nextInt();
        System.out.println(Sum(n));
    }
    public static int Sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
