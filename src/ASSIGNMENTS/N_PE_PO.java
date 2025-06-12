//Write a program to print the sum of negative numbers,
// sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.
package ASSIGNMENTS;
import java.util.Scanner;

public class N_PE_PO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumnegative = 0;
        int sumpositiveeven = 0;
        int sumpositiveodd = 0;
        while(true){
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            else if(n <= 0){
                sumnegative += n;
            } else if (n >= 0 && n % 2 == 0) {
                sumpositiveeven += n;
            } else if (n >= 0 && n % 2 != 0) {
                sumpositiveodd += n;
            }
            else {
                System.out.println("Invalid input");
            }
        }
        System.out.println("Sum of negative numbers is: " +sumnegative);
        System.out.println("Sum of positive even numbers is: " +sumpositiveeven);
        System.out.println("Sum of positive odd numbers is: " +sumpositiveodd);
    }
}
