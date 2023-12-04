// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
       //int number1 = (int)(Math.random() * 10);
        //int number2 = (int)(Math.random() * 10);

        //Scanner input = new Scanner(System.in);
        //System.out.print("What is " + number1 + "+" + number2 + "? " );
        //int answer = input.nextInt();

        //while (number1 + number2 !=answer){
        // System.out.print("Wrong anwser. Try again. What is " + number1 + "+" + number2 + "? ");
        // answer = input.nextInt();
        //}
        //System.out.println("You Got It");

        //int number=(int)(Math.random() * 101);
        //Scanner input = new Scanner(System.in);
        //System.out.println("Guess a magic number between 0 and 100");

        //int guess = -1;
        //while (guess != number){
           // System.out.print("\nEnter your Guess: ");
            //guess = input.nextInt();

           // if(guess == number)
           //     System.out.println("Yes, the number is " + number);
          //  else if (guess>number)
          //      System.out.println("Your guess is too high. Try again.");
         //   else
           //     System.out.println("Your guess is too low. Try again.");


        final int NUMBER_OF_QUESTIONS = 2;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        Scanner input= new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
         int number1 =(int)(Math.random()*10);
         int number2 =(int)(Math.random()*10);

         if (number1<number2){
             int temp = number1;
             number1=number2;
             number2=temp;
         }

         System.out.print("What is " + number1 + " - " + number2 + "? ");
         int answer = input.nextInt();

         if (number1-number2 == answer){
             System.out.println("You are correct\n");
             correctCount++;
         }
         else
             System.out.println("Your answer is wrong.\n" + number1 + " - " + number2+ " should be " + (number1-number2 + "\n"));

         count++;

         output += "\n" + number1 + " - " + number2 + "=" + answer + ((number1 - number2 == answer) ? " correct" : " wrong");

        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
        }
    }
