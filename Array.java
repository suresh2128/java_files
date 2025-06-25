import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.err.print("Enter the length of the Array : ");
        int q = s.nextInt();
        int[] arr = new int[q];
        for(int i=0;i<q;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<q;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
    }
}
