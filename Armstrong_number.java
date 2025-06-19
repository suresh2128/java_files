import java.util.*;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = s.nextInt();
        int original = num;
        int digits = String.valueOf(num).length(); // check the length of the number
        int sum = 0;

        while (num > 0) {
            int r = num % 10;
            sum += Math.pow(r, digits); // use for checking the any length of the number
            num /= 10;
        }

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");

        s.close();
    }
}
