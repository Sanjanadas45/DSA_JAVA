//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
package ASSIGNMENTS;
import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an age: ");
        int age = sc.nextInt();
        voter(age);
    }
    public static void voter(int age){
        if(age >= 18){
            System.out.println("The person is eligible to vote");
        }
        else {
            System.out.println("The person is not eligible to vote");
        }
    }
}
