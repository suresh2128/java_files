import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = s.nextInt();
        int original = a;   
        int e = 0;

        while (a > 0) {
            int r = a % 10;
            e = e * 10 + r;
            a = a / 10;
        }

        if (e == original) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is Not Palindrome");
        }

        s.close();
    }
}
