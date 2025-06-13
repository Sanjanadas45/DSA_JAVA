//Write a function to check if a given triplet is a Pythagorean triplet or not.
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
package ASSIGNMENTS;
import java.util.Scanner;

public class Pythagorean_Triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        pythagorean(a, b, c);
    }
    public static void pythagorean(int a, int b, int c){
        if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
            System.out.println("Given triplet is Pythagorean triplet");
        }
        else{
            System.out.println("Given triplet is not Pythagorean triplet");
        }
    }
}
