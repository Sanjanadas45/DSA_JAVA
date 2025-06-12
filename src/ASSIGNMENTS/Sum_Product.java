//Write a program to print the sum of two numbers entered by user by defining your own method.
//Define a method that returns the product of two numbers entered by user.
package ASSIGNMENTS;
import java.util.Scanner;

public class Sum_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Sum(a, b);
        product(a, b);
    }
    public static void Sum(int a, int b){
        int sum = a + b;
        System.out.println("Sum of two numbers is: " +sum);
    }
    public static void product(int a, int b){
        int prod = a * b;
        System.out.println("Product of two numbers: " +prod);
    }
}
