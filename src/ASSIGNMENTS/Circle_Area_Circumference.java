//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package ASSIGNMENTS;
import java.util.Scanner;

public class Circle_Area_Circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius = sc.nextInt();
        area_circumference(radius);
    }
    public static void area_circumference(float r){
        if(r == 0){
            System.out.println("Invalid Input");
        }
        else{
            double area = Math.PI * r * r;
            double circum = 2 * Math.PI * r;
            System.out.println("Area of the circle is: " +area);
            System.out.println("Circumference of the circle is: " +circum);
        }
    }
}
