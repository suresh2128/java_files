import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Value: ");
        int q = s.nextInt();

        if (q == 0) {
            System.out.println("The factorial of " + q + " is: 1");
        } else {
            int f = 1;
            for (int i = 1; i <= q; i++) {
                f = f * i;
            }
            System.out.println("The factorial of " + q + " is: " + f);
        }

        s.close();
    }
}
