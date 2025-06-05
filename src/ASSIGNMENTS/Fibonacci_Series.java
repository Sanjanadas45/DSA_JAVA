package ASSIGNMENTS;
import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit: ");
        int n = sc.nextInt();
        int n1 = 0,n2 = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(n1 + " ");
            //SWAP
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
