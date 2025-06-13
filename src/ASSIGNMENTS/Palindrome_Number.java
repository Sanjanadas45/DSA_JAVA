//Write a function to find if a number is a palindrome or not. Take number as parameter.
package ASSIGNMENTS;
import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        Palin(n);
    }
    public static void Palin(int n){
        if(n <= 1){
            System.out.println("Invalid Input");
        }
        int rev = 0;
        int temp = n;
        while (temp != 0){
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }
        if(rev == n){
            System.out.println(n + " is a Palindrome Number");
        }
        else{
            System.out.println(n + " is a Palindrome Number");
        }
    }
}
