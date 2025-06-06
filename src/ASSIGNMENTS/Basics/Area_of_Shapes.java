package ASSIGNMENTS.Basics;
import java.util.Scanner;

public class Area_of_Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the radius: ");
//        float r = sc.nextFloat();
//        Area_Circle(r);

//        System.out.println("Enter the base and height: ");
//        float b = sc.nextFloat();
//        float h = sc.nextFloat();
//        Area_of_Triangle_Parallelogram(b, h);

//        System.out.println("Enter the length and breadth: ");
//        float l = sc.nextFloat();
//        float b = sc.nextFloat();
//        Area_of_Rectangle(l, b);

//        System.out.println("Enter equal side and base: ");
//        float a = sc.nextFloat();
//        float b = sc.nextFloat();
//        Area_of_Isosceles_Triangle(a, b);

//        System.out.println("Enter the base and height: ");
//        float b = sc.nextFloat();
//        float h = sc.nextFloat();
//        Area_of_Rhombus(b, h);

        System.out.println("Enter the side: ");
        float a = sc.nextFloat();
        Area_of_Equilateral_Triangle(a);
    }
    public static void Area_Circle(float r){
        float area = (float) (Math.PI * r * r);
        System.out.println("Area of circle is: " +area);
    }
    public static void Area_of_Triangle_Parallelogram(float b, float h){
        float v = b * h;
        float a = (float) ((0.5) * v);
        System.out.println("Area of triangle and parallelogram is: " +a);
    }
    public static void Area_of_Rectangle(float l, float b){
        float a = l * b;
        System.out.println("Area of rectangle is: " +a);
    }
    public static void Area_of_Isosceles_Triangle(float a, float b){ //a = equal side
        float area = (float) ((float) (0.5 * b) * Math.sqrt(4 * Math.pow(a, 2) - Math.pow(b, 2)));
        System.out.println(area);
    }
    public static void Area_of_Rhombus(float b, float h){
        float v = b * h;
        float a = (float) ((0.5) * v);
        System.out.println("Area of rhombus is: " +a);
    }
    public static void Area_of_Equilateral_Triangle(float a){
        float area = (float) ((Math.sqrt(3) / 4) * (Math.pow(a, 2)));
        System.out.println(area);
    }
}
