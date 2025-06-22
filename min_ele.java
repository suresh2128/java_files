import java.util.*;
public class min_ele {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Length of the Array : ");
        int q = s.nextInt();
        int[] arr = new int[q];
        for(int i=0;i<q;i++){
            arr[i] = s.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<q;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The Minimum element of the Array is : "+min);
        s.close();
    }
}
