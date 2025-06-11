package ASSIGNMENTS.Basics;
import java.util.Scanner;

public class Perimeter_of_Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter radius: ");
//        float radius = sc.nextFloat();
//        Perimeter_of_Circle(radius);
//        System.out.println("Enter side: ");
//        int side = sc.nextInt();
//        Perimeter_of_Equilateral_Triangle(side);
//        System.out.println("Enter two sides: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        Perimeter_of_Parallelogram(a, b);
//        System.out.println("Enter length: ");
//        int l = sc.nextInt();
//        System.out.println("Enter breadth: ");
//        int b = sc.nextInt();
//        Perimeter_of_Rectangle(l, b);
        System.out.println("Enter side: ");
        int side = sc.nextInt();
        Perimeter_of_Square_Rhombus(side);
    }
    static void Perimeter_of_Circle(float radius){
        float p = (float) (2 * Math.PI * radius);
        System.out.println("Perimeter of Circle is: " +p);
    }
    static void Perimeter_of_Equilateral_Triangle(int a){
        int p = 3 * a;
        System.out.println("Perimeter of equilateral triangle is: " +p);
    }
    static void Perimeter_of_Parallelogram(int a, int b){
        int p = 2 * (a + b);
        System.out.println("Perimeter of parallelogram: " +p);
    }
    static void Perimeter_of_Rectangle(int a, int b){
        int p = 2 * (a + b);
        System.out.println("Perimeter of rectangle: " +p);
    }
    static void Perimeter_of_Square_Rhombus(int a){
        int p = 4 * a;
        System.out.println("Perimeter of rectangle: " +p);
    }
}
