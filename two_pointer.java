import java.util.*;
public class two_pointer {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = s.nextLine();

        int left = 0;
        int right = word.length()-1;
        boolean palindrome = true;

        while (left < right){
            if (word.charAt(left)!= word.charAt(right)){
                palindrome = false;
                break;
            }
        left++;
        right--;
        }

        if(palindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindromes");
        }

    s.close();
    }
}
