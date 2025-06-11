//Calculate Average Of N Numbers
package ASSIGNMENTS;
import java.util.Scanner;

public class Average_TillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
            float avg = (n + 1) / 2; //sum of n natural numbers is n(n + 1) / 2
        System.out.println("Average is: " +avg);
    }
}
