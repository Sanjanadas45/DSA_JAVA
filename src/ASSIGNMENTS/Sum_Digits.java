//Sum Of A Digits Of Number
package ASSIGNMENTS;
import java.util.Scanner;

public class Sum_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
    public static int sum(int n){
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }
}
