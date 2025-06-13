//Write a function that returns all prime numbers between two given numbers.
package ASSIGNMENTS;
import java.util.Scanner;

public class Prime_WithinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two limits: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            System.out.println(i + " " + Prime(i));
        }
    }
    public static boolean Prime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
