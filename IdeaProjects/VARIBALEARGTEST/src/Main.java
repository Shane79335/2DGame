// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        printMax(34,3,3,4,56.5);
        printMax(new double[]{1,2,3});
    }

    public static void  printMax(double... numbers){
        if(numbers.length == 0){
            System.out.println("NO argument passed");
            return;
        }
        double result = numbers[0];
        for (int i = 1; i< numbers.length; i++)
            if(numbers[i]>result)
                result = numbers[i];
        System.out.println("The max value is "+ result);
    }
}