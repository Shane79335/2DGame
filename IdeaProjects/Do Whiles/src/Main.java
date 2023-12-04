import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int data, sum = 0;
        do{


            System.out.print("Enter an integer (Enter 0 to quit): ");
            data = input.nextInt();
            sum+=data;
        }while(data!=0);

        System.out.println("The Sum is "+sum);
    }
}