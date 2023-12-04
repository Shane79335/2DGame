//Header comment September 21 .
// prpmpts the user for a string, tell the user how many characters are in the string
// and what the last character is
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String word = input.next();
        char letter;
        int len = word.length();
        System.out.println("Your word has "+ len +" letters");
        letter = word.charAt(len - 1);
        System.out.println("The last character in your word " + letter);

    }
}