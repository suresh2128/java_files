import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};

        Set <Integer> n = new LinkedHashSet<>();

        for(int a : nums){
            n.add(a);
        }

        System.out.println(n.size());
    }
}
