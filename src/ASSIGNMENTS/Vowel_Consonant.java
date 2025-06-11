//Java Program Vowel Or Consonant
package ASSIGNMENTS;
import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String input = sc.next();
        char ch = input.charAt(0);
        VC(ch);
    }
    public static void VC(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel is: " +ch);
        }
        else{
            System.out.println("Consonant is: " +ch);
        }
    }
}
