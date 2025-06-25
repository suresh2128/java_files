import java.util.*;
public class shortcuts {
    public static void main (String[] srgs){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first Value : ");
        int a = s.nextInt();
        System.out.print("Enter the Second VAlue : ");
        int b = s.nextInt();
        System.out.println("Maximum Number is : "+Math.max(a,b));
        
        System.out.println("Minimum Number is : "+Math.min(a,b));

        s.close();
    }
}
