//Sum Of N Numbers
package ASSIGNMENTS;
import java.util.Scanner;

public class Sum_TillN {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two limits: ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += i;
        }
        System.out.println("Sum is: " +sum);
    }
}
