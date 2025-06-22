import java.util.*;

public class Armstrong_number_in_range {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int q = s.nextInt();

        System.out.print("Enter the ending number: ");
        int w = s.nextInt();


        for (int i = q; i <= w; i++) {
            int temp = i;
            int digits = String.valueOf(i).length();
            int sum = 0;

            int num = i;  // make a copy for digit extraction
            while (num > 0) {
                int r = num % 10;
                sum += Math.pow(r, digits);
                num = num / 10;
            }

            if (sum == temp) {
                System.out.println(i);
            }
        }

        s.close();
    }
}
