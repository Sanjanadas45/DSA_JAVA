package ASSIGNMENTS.Basics;
import java.util.Scanner;

public class Volume_of_Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter radius and height: ");
//        float r = sc.nextFloat();
//        float h = sc.nextFloat();
//        Volume_of_Cone(r, h);
//        System.out.println("Enter radius and height: ");
//        float r = sc.nextFloat();
//        float h = sc.nextFloat();
//        Volume_of_Cylinder(r, h);
//        System.out.println("Enter radius: ");
//        float r = sc.nextFloat();
//        Volume_of_Sphere(r);
//        System.out.println("Enter base length, height and base width: ");
//        float base_length = sc.nextFloat();
//        float base_width = sc.nextFloat();
//        float height = sc.nextFloat();
//        System.out.println(Volume_of_Pyramid(base_length, base_width, height));
//        System.out.println("Enter radius and height: ");
//        float r = sc.nextFloat();
//        float h = sc.nextFloat();
//        Curved_Surface_Area_of_Cylinder(r,h);
        System.out.println("Enter side: ");
        float a = sc.nextFloat();
        Total_Surface_Area_of_Cube(a);
    }
    public static void Volume_of_Cone(float radius, float height){
        float v = (float) ((Math.PI) * Math.pow(radius,3) * height / 3);
        System.out.println("Volume of cone is: " +v);
    }
    public static void Volume_of_Cylinder(float r, float h){
        float v = (float) ((Math.PI) * Math.pow(r, 2) * h);
        System.out.print("Volume of cylinder is: " +v);
    }
    public static void Volume_of_Sphere(float radius){
        float v = (float) ((4/3) * Math.PI * Math.pow(radius, 3));
        System.out.print("Volume of sphere is: " +v);
    }
    public static float Volume_of_Pyramid(float l, float bw, float h){
        float b = l * bw;
        float v = b * h * (1.0f/3.0f);
        return v;
    }
    public static void Curved_Surface_Area_of_Cylinder(float radius, float height){
        float csa = (float) (2 * (Math.PI) * Math.pow(radius, 2) * height);
        System.out.println("Curved Surface Area of Cylinder is: " +csa);
    }
    public static void Total_Surface_Area_of_Cube(float side){
        float tsa = (float) (6 * Math.pow(side, 2));
        System.out.println("Total Surface Area of Cube is: " +tsa);
    }
}
