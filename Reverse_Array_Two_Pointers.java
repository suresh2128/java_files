import java.util.*;
public class Reverse_Array_Two_Pointers {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        int q = s.nextInt();
        int[] num = new int[q];
        for(int i=0;i<q;i++){
            num[i]=s.nextInt();
        }
        int left=0, right=num.length-1;
        while(left<right){
            int temp = num[left];
            num[left] = num[right];
            num[right]= temp;
        
            left++;
            right--;
        }

        for(int i=0;i<q;i++){
            System.out.print(num[i]+" ");
        }
        s.close();
    }
}
