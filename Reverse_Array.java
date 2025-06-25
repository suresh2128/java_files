import java.util.*;
public class Reverse_Array {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        int q = s.nextInt();
        int nums[] = new int[q];
        for(int i=0;i<q;i++){
            nums[i]=s.nextInt();
        }
        for(int i=nums.length-1;i>=0;i--){
            System.out.print(nums[i]+" ");
        }
        s.close();
    }
}
