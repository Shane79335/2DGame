// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// The program will prompt user for int and pass int to method
// which will add to 1 to int and return total to main
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positve inteager: ");
        int number = input.nextInt();
        int total = Addit(number);
        System.out.print("The sum of 1 to " + number+ " is " + total);
    }

    public static int Addit(int num)
    {
        int sum= 0;
        for(int i = 1; i<=num; i++)
        {
            sum+=i;
        }
        return sum;
    }
}