import java.util.*;

public class Even_odd_in_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        int num[] = new int[q];

        for (int i = 0; i < q; i++) {
            num[i] = s.nextInt();
        }

        int even = 0, odd = 0;

        for (int j = 0; j < num.length; j++) {
            if (num[j] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        s.close();
    }
}
