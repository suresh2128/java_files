import java.util.*;
public class factors {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter the value :");
        int q = s.nextInt();
        for(int i=2;i<q;i++){
            if(q%i==0){
                System.out.println(i);
            }
        }
        s.close();
    }
}
