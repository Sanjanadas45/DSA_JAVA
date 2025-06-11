//Calculate Distance Between Two Points
package ASSIGNMENTS;
import java.util.Scanner;

public class Distance_2Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two coordinates of first point: ");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        System.out.println("Enter two coordinates of second point: ");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        distance_twopoints(x1, x2, y1, y2);
    }
    public static void distance_twopoints(int x1, int x2, int y1, int y2){
        float dist = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance between two points is: " +dist);
    }
}
