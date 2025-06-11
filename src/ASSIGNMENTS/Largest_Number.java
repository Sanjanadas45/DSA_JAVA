//Take 2 numbers as input and print the largest number.
package ASSIGNMENTS;
import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1 > n2){
            System.out.println("Largest number: " +n1);
        }else{
            System.out.println("Largest number: " +n2);
        }
    }
}
