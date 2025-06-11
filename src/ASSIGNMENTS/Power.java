//Power In Java
package ASSIGNMENTS;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and its power: ");
        int n = sc.nextInt();
        int p = sc.nextInt();
        power(n, p);
    }
    public static void power(int a, int b){
        float p = (float) Math.pow(a, b);
        System.out.println(p);
    }
}
