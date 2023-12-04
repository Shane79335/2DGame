// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 101);
        Scanner input= new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        while(true){
            System.out.print("\nEnter your guess: ");
            int guess = input.nextInt();

            if (guess == number){
                System.out.println("Yes, the number is " + number);
                break;
            }
            else if( guess > number)
                System.out.println("Your Guess is too high");
            else
                System.out.println("Youe guess is too low");
        }
    }
}