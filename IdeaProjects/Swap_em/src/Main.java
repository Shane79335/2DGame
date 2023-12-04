// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int number1, number2;
        Scanner input = new Scanner(System.in);
        System.out.println("This program will prompt the user for two ints and then swap them");
        System.out.print("Please enter an int: ");
        number1 = input.nextInt();
        System.out.print("Please enter an int: ");
        number2 = input.nextInt();
        System.out.println("Before the swap your numbers are: " + number1 + " and " + number2);
        Do_The_Swap(number1, number2);
        System.out.println("\n\nAfter the swap your numbers are: " + number1 + " and " + number2);
    }
    public static void Do_The_Swap(int num1,int num2){
        int temp;
        System.out.println("\n\nIN THE METHOD: Before the swap the numbers are: "+num1+" and "+num2);
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("IN THE METHOD: After the swap the numbers are: "+num1+" and "+num2);

    }

}