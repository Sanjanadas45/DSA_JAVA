//Perfect Number In Java
package ASSIGNMENTS;
import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        Perfect(n);
    }
    public static void Perfect(int num){
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if(num % i == 0){
                sum += i;
            }
        }
        if (sum == num || num != 0){
                System.out.println(num + " is perfect number");
            }
        else {
                System.out.println(num + " is not a perfect number");
        }
    }
}
