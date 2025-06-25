import java.util.*;

public class Searching {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int q = s.nextInt();

        int num[] = new int[q];
        System.out.println("Enter the elements:");
        for (int i = 0; i < q; i++) {
            num[i] = s.nextInt();
        }

        System.out.print("Enter the value to search: ");
        int find = s.nextInt();

        boolean found = false;
        for (int i = 0; i < q; i++) {
            if (num[i] == find) {
                System.out.println("The index of the value is: " + i);
                found = true;
                break; // Optional: break if only the first match is needed
            }
        }

        if (!found) {
            System.out.println("Value not found in the array.");
        }

        s.close();
    }
}
