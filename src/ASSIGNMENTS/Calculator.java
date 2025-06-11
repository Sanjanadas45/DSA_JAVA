//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package ASSIGNMENTS;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Enter an operator: ");
        char op = sc.next().trim().charAt(0); // take op as input in char
        //if(op == '+' || op == '-' || op == '*' || op == '/'){
        if(op == '+'){
                ans = n1 + n2;
        }
        if(op == '-'){
            ans = n1 - n2;
        }
        if(op == '*'){
            ans = n1 * n2;
        }
        if(op == '/'){
            ans = n1 / n2;
        } else if (op == 'x') {
            System.out.println("Invalid operation");
        }
        else {
            System.out.println(ans);
        }
    }
}
