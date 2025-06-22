import java.util.*;
public class max_ele{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int q = s.nextInt();
        int[] arr = new int[q];
        for(int i=0;i<q;i++){
            arr[i] = s.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<q;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print("The maximum element of the array is : " +max);
        s.close();
    }
}