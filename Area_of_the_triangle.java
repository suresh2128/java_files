import java.util.*;

public class Area_of_the_triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = s.nextDouble();

        System.out.print("Enter side b: ");
        double b = s.nextDouble();

        System.out.print("Enter side c: ");
        double c = s.nextDouble();

        
        double s1 = (a + b + c) / 2.0;

       
        double area = Math.sqrt(s1 * (s1 - a) * (s1 - b) * (s1 - c));

        System.out.printf("Area of the triangle is: %.2f", area);


        s.close();
    }
}


