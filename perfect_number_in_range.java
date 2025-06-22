import java.util.*;
public class perfect_number_in_range {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int q = s.nextInt();
        System.out.print("Enter the ending number: ");
        int w = s.nextInt();

        for (int i = q; i <= w; i++) {
            int sum = 0;  
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }

        s.close();
    }
}
