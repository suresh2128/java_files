import java.util.*;

// In util package java automatically import the Arrays package so from that we use the srt function directly.


public class Array1 {
    public static void main(String[] args) {

        int arr[] = {3,2,5,8,7,9,7,1,5,8,9,7,4,6,3,2,1};
        Arrays.sort(arr);
        
        Set <Integer> ns = new LinkedHashSet<>();

        //LinkedHashSet is used bcz it doesn't change the orginal order of the list

        for(int n : arr){
            ns.add(n);
        }
        for(int a : ns){
            System.out.print(a + " ");
        }
    }
}
