import java.util.Scanner;

public class AreaCalculator {
    
    // TODO: Define calculateArea(float radius) -> returns area of circle
    // Use Math.PI or 3.14159f for pi
    public static double calculateArea(float radius){
        return 3.14159f*radius*radius;
    }

    // TODO: Define calculateArea(float length, float breadth) -> returns area of rectangle
    
    public static double calculateArea(float length, float breadth) {
        return length*breadth;
    }
    
    // TODO: Define calculateArea(double base, double height) -> returns area of triangle
    
    public static double calculateArea(double base, double height) {
        return 0.5*base*height;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read input for Circle (radius)
        float radius = Float.parseFloat(sc.nextLine());
        // TODO: Read input for Rectangle (length, breadth)
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
       sc.nextLine(); 
        // TODO: Read input for Triangle (base, height)
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        // TODO: Call methods and print results formatted to 2 decimal places
        // Hint: Use System.out.printf("%.2f\n", area);
         System.out.printf("%.2f\n", calculateArea(radius));
         System.out.printf("%.2f\n", calculateArea(length, breadth));
         System.out.printf("%.2f", calculateArea(base, height));
    }
}
