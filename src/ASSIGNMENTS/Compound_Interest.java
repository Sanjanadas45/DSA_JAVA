//Compound Interest Java Program
package ASSIGNMENTS;
import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        int p = sc.nextInt();
        System.out.println("Enter rate: ");
        int r = sc.nextInt();
        System.out.println("Enter number of years: ");
        int n = sc.nextInt();
        System.out.println("Enter number of times interest is compounded per year: ");
        int t = sc.nextInt();
        CI(p, r, n, t);
    }
    public static void CI(int p, int r, int n, int t){
        double amt = p * Math.pow((1 + (double) r / n), n * t);
        double ci = amt - p;
        System.out.printf("Compound Interest after %d years: %.2f\n", t, ci);
        System.out.printf("Total Amount after %d years: %.2f\n", t, amt);
    }
}
