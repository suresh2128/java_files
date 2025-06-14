import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        int a = s.nextInt();
        System.out.print("Enter the value of B : ");
        int b = s.nextInt();
        System.out.print("Enter the value of C : ");
        int c = s.nextInt();
        double average = (a + b + c) / 3.0;
        System.out.println("The Average of the numbers is : " + average);
        s.close();
    }
}
