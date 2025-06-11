import java.util.*;
import java.lang.Math;
public class Armstrong_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int n, rem, sum = 0;
        n = num;
        while (n > 0) { //also n != 0 is valid
            rem = n % 10;
            sum += Math.pow(rem, 3);
            n = n / 10;
        }
        if (sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
