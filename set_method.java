import java.util.*;
public class set_method {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Suresh");
        list.add("Ramesh");
        list.add("Rakesh");
        list.add("Shiva");
        list.add("Yuvaraj");
        list.add("Gangadhar");
        list.add("Suresh");
        
        Set<String> new_list= new LinkedHashSet<>(list); //It will maintain the original order of the list after the set.
        
        ArrayList<String> result = new ArrayList<>(new_list);

        System.out.println(result);
    }
}
