import java.util.*;
public class perfect_number {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter the Value: ");
        int q = s.nextInt();
        int sum = 0;
        for(int i=1;i<q;i++){
            if(q%i==0){
                sum+=i;
            }
        }
        if (q==sum){
            System.out.println(q+" is Perfect Number");
        }
        else{
            System.out.println(q+" is not Perfect Number");
        }
        s.close();
    }
}
