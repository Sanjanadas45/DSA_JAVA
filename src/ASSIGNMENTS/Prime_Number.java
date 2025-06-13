//Define a method to find out if a number is prime or not.
package ASSIGNMENTS;
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        prime(n);
    }
    public static void prime(int n){
        if (n <= 1) {
            System.out.println("Invalid Input");
            return; // Exit the method if input is invalid
        }
        int c = 2;
        while(c * c <= n) {
            if (n % c == 0) {
                System.out.println(n + " is a not a Prime Number");
                return; // Exit if a divisor is found
            }
            c++;
        }
        System.out.println(n + " is Prime Number");
    }
}