import java.util.*;
public class prime_number {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        boolean isPrime = true;

        if(a<1){
            isPrime = false;
        }
        else{
            for (int i=2; i<= a/2; i++){
                if(a%i==0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }

        s.close();
    }
}
