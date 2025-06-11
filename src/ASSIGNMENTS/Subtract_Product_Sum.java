package ASSIGNMENTS;
import java.util.Scanner;

public class Subtract_Product_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(subtractProductAndSum(num));
    }
    static int subtractProductAndSum(int num){
        int sum = 0;
        int prod = 1;
        while(num != 0){
            int digit = num % 10;
            sum = sum + digit;
            prod = prod * digit;
            num = num / 10;
        }
        return prod - sum;
    }
}
