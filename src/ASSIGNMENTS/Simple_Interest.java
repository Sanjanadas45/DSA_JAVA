package ASSIGNMENTS;
import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal: ");
        int p = sc.nextInt();
        System.out.println("Enter rate: ");
        int r = sc.nextInt();
        System.out.println("Enter time: ");
        int t = sc.nextInt();
        int SI;
        SI = (p * r * t) / 100;
        System.out.println("Simple Interest is: " +SI);
    }
}
