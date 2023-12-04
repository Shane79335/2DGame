// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st int: ");
        int n1 = input.nextInt();
        System.out.print("Enter 2nd int: ");
        int n2 = input.nextInt();

        System.out.println("The Greatest Common Divisior for " + n1 + " and " + n2 +" is " + gcd(n1,n2));
    }
    public static int gcd(int n1, int n2){
        int gcd = 1;
        int k = 1;
        while(k<=n1  && k <=n2){
            if(n1%k==0 && n2%k==0)
                gcd=k;
            k++;
        }
        return gcd;
    }
}