import java.util.*;
public class even_odd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = s.nextInt();
        if(a%2==0)
        System.out.println("Even Number");
        else
        System.out.println("odd Number");
        s.close();
    }
}
