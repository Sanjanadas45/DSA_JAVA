//Calculate Depreciation of Value
package ASSIGNMENTS;
import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of asset: ");
        double cost = sc.nextDouble();
        System.out.println("Enter the salvage value: ");
        double salvage = sc.nextDouble();
        System.out.println("Enter the useful life: ");
        int useful = sc.nextInt();
        depreciation(cost, salvage, useful);
    }
    public static void depreciation(double cost, double salvage, int useful){
//        Cost of Asset is the initial value of the asset
//        Salvage Value is the estimated value at the end of its useful life
//        Useful Life is the number of years the asset is expected to be useful
        double dep = (cost - salvage) / useful;
        System.out.println("Depreciation Value is: " +dep);
    }
}
