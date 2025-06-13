//Write a program to print the factorial of a number by defining a method named 'Factorial'.
//E.g.-
//        4! = 1 * 2 * 3 * 4 = 24
//        3! = 3 * 2 * 1 = 6
//        2! = 2 * 1 = 2
//Also,
//        1! = 1
//        0! = 1
package ASSIGNMENTS;
import java.util.Scanner;

public class Fact_tillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two limits: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            System.out.println("Factorial of the number " + i +  " is: " +fact(i));
        }
    }
    public static int fact(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
