//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package ASSIGNMENTS;
import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        Max(n1, n2, n3);
        Min(n1, n2 ,n3);
    }
    public static void Max(int first, int second, int third){
        int max = first;
        if(second > max){
            max = second;
            System.out.println("Largest number is: " +max);
        } else if (third > max) {
            max = third;
            System.out.println("Largest number is: " +max);
        }
        else {
            System.out.println("Largest number is: " +max);
        }
    }
    public static void Min(int first, int second, int third){
        int min = first;
        if(second < min){
            min = second;
            System.out.println("Smallest number is: " +min);
        } else if (third < min) {
            min = third;
            System.out.println("Smallest number is: " +min);
        }
        else {
            System.out.println("Smallest number is: " +min);
        }
    }
}
