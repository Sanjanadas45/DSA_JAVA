//Take name as input and print a greeting message for that particular name.
package ASSIGNMENTS;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = sc.next();
        System.out.println("Hello " + name + " Hope you are doing well!");
    }
}
