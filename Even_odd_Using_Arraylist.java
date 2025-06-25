import java.util.*;

public class Even_odd_Using_Arraylist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        int nums[] = new int[q];

        for (int i = 0; i < q; i++) {
            nums[i] = s.nextInt();
        }

        ArrayList<Integer> Even = new ArrayList<>();
        ArrayList<Integer> Odd = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            if (nums[i] % 2 == 0) {
                Even.add(nums[i]);
            } else {
                Odd.add(nums[i]);
            }
        }

       
        for (int j = 0; j < Even.size(); j++) {
            System.out.print(Even.get(j));
            if (j < Even.size() - 1) {
                System.out.print(" ");
            }
        }

        System.out.println(); 

    
        for (int j = 0; j < Odd.size(); j++) {
            System.out.print(Odd.get(j));
            if (j < Odd.size() - 1) {
                System.out.print(" ");
            }
        }

        s.close();
    }
}
