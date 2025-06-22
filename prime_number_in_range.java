import java.util.*;

public class prime_number_in_range {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int q = s.nextInt();
        System.out.print("Enter the ending number: ");
        int w = s.nextInt();
        
        for(int i = q; i <= w; i++) {
            if (i < 2) continue;  // skip 0 and 1

            boolean isprime = true;
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if(isprime) {
                System.out.print(i + " ");
            }
        }

        s.close();
    }
}
