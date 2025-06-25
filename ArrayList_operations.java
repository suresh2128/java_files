import java.util.ArrayList;

public class ArrayList_operations {
    public static void main(String[] args) {

        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);

        System.out.println(list); 

        // Checking if 11 is present in the list
        System.out.println(list.contains(11));


        // Adding 15 to the end of the list
        list.add(15);
        System.out.println(list); 


        // Removing the value 12 from the list (not by index)
        list.remove(Integer.valueOf(12));
        System.out.println(list); 


        // Replacing the element at index 2 with 25
        list.set(2, 25);
        System.out.println(list); 

        
        // Getting the value at index 2
        System.out.println(list.get(2)); 


        // Checking if the list is empty
        System.out.println(list.isEmpty()); 

        // Getting the size (number of elements) of the list
        System.out.println(list.size()); 

        // Removing all elements from the list
        list.clear();
        System.out.println(list); 
    }
}
