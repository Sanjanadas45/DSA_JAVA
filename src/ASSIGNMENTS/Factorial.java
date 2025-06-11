//Factorial Program In Java
package ASSIGNMENTS;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        factorial(num);
    }
    public static void factorial(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of the number is: " +fact);
    }
}
