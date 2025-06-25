import java.util.*;
public class sum_of_array {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int q = s.nextInt();
        int arr[] = new int[q];
        for(int i=0;i<q;i++){
            arr[i]=s.nextInt();
        }
        int sum = 0;
        for(int i=0;i<q;i++){
            sum+=arr[i];
        }
        System.out.println("The total sum is: " + sum);
        s.close();
    }
}
