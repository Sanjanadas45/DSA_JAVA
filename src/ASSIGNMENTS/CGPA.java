//Calculate CGPA Java Program
package ASSIGNMENTS;
import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int n = sc.nextInt();
        double total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter grade points: ");
            int gp = sc.nextInt();
            total += gp;
        }
        double cgpa = total / n;
        System.out.println("Total CGPA is: " +cgpa);
    }
}
