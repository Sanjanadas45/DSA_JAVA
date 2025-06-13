//Write a program that will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered as below:
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail
package ASSIGNMENTS;
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks out of 100: ");
        int mark = sc.nextInt();
        marks(mark);
    }
    public static void marks(int m){
        if(m >= 91 && m <= 100){
            System.out.println("Grade is AA");
        } else if (m >= 81 && m <= 90) {
            System.out.println("Grade is AB");
        } else if (m >= 71  && m <= 80) {
            System.out.println("Grade is BB");
        } else if (m >= 61 && m <= 70) {
            System.out.println("Grade is BC");
        } else if (m >= 51 && m <= 60) {
            System.out.println("Grade is CD");
        } else if (m >= 41 && m <= 50) {
            System.out.println("Grade is DD");
        }
        else {
            System.out.println("Grade is Fail");
        }
    }
}
