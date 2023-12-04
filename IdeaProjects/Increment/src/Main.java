// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int x =1;
        System.out.println("Before the call, x is "+ x);
        increment(x);
        System.out.println("After the call, x is still "+ x);
    }
    public static void increment(int n){
        n++;
        System.out.println("n inside the method is " + n);
    }
}