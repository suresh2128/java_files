import java.util.*;

public class string_palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = s.nextLine();
        String dup = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            dup = dup + word.charAt(i);
        }

        if (dup.equals(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        s.close();
    }
}
