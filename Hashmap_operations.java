import java.util.*;

public class Hashmap_operations {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        //adding the elements in to the map
        map.put(1, "Suresh");  
        map.put(2, "Rakesh");  
        map.put(3, "Shiva");

        System.out.println(map); 

        //Checking the key is present or not in the map
        if(map.containsKey(3)){
            System.out.println("True");
        }
        else{
            System.out.println("Flase");
        }

        // get method display the elements using their key values
        System.out.println(map.get(4));

        for( Map.Entry<Integer, String> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            System.out.println(key+ " "+map.get(key));
        }
        


    }
}
