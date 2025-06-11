//ake integer inputs till the user enters 0 and print the largest number from all.
package ASSIGNMENTS;
import java.util.Scanner;

public class Largest_Num_Till0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        while(true){
            System.out.println("Enter two numbers: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if(n1 == 0 || n2 == 0){
                break;
            }
            try{
                if(n1 > n2){
                    System.out.println("Largest number is: " +n1);
                    largest = n1;
                }
                else{
                    System.out.println("Largest number is: " +n2);
                    largest = n2;
                }
                System.out.println("Current largest number is: " +largest);
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input");
            }
        }
        System.out.println("Final largest number is: " +largest);
    }
}
