import java.lang.Math;
import java.util.Scanner;
public class school {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        double a = scan.nextDouble();
        System.out.println("enter second number");
        double b = scan.nextDouble();
        System.out.println("enter third number");
        double c = scan.nextDouble();
        double min = Math.min(Math.min(a, b), c);
        double max = Math.max(Math.max(a, b), c);
        System.out.println("max is " + max);
        System.out.println("min is " + min);
    }
}
