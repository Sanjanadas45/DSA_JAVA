//Find Ncr & Npr
package ASSIGNMENTS;
import java.util.Scanner;

public class P_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of items: ");
        int n = sc.nextInt();
        System.out.println("Enter number of items selected: ");
        int r = sc.nextInt();
        p_c(n, r);
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void p_c(int n, int r){
        if(n == 0 || r == 0){
            System.out.println("Invalid input!");
        }
        int ncr = factorial(n) / (factorial(r) * factorial(n - r));
        int npr = factorial(n) / factorial(n - r);

        System.out.println("Combinations: " +ncr);
        System.out.println("Permutations: " +npr);
    }
}
