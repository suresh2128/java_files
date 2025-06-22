import java.util.*;

public class string_operations {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String q = s.nextLine();

        System.out.println("Length: " + q.length());                      // Returns the length of the string

        System.out.println("Character at index 3: " + q.charAt(3));      // Character at position 3
        
        System.out.println("Lowercase: " + q.toLowerCase());             // Convert to lowercase
        
        System.out.println("Uppercase: " + q.toUpperCase());             // Convert to uppercase
        
        System.out.println("Replace 's' with 'A': " + q.replace('s','A'));// Replace 's' with 'A'
        
        System.out.println("Equals 'karra': " + q.equals("karra"));      // Check if equal to "karra"
        
        System.out.println("Substring (1,3): " + q.substring(1, 3));     // Substring from index 1 to 2
        
        System.out.println("EqualsIgnoreCase 'suresh': " + q.equalsIgnoreCase("suresh")); // Case-insensitive match
        
        System.out.println("Starts with 'S': " + q.startsWith("S"));     // Check start letter
        
        System.out.println("Ends with 'h': " + q.endsWith("h"));         // Check end letter
        
        System.out.println("Index of 'e': " + q.indexOf("e"));           // First index of 'e'

        s.close();
    }
}
