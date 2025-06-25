import java.util.*;
public class Array_operations {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        int[] arr = new int[q];
        for(int i=0;i<q;i++){
            arr[i]=s.nextInt();
        }
        System.out.println((arr[2]));

        s.close();
    }
}
