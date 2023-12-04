// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximum between " + i + " and " + j + " is " + k);

        System.out.println("The grade is via returning char:  " + getGrade(78.5));
        System.out.println("The grade is via returning char: " + getGrade(59.5) + "\n");

        System.out.print("The grade is via printing: ");
        printGrade(78.5);

        System.out.print("The grade is via printing: ");
        printGrade(59.5);

    }

    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }

    public static char getGrade(double num1) {
        if (num1 >= 90)
            return 'A';
        else if (num1 >= 80)
            return 'B';
        else if (num1 >= 70)
            return 'C';
        else if (num1 >= 60)
            return 'D';
        else
            return 'F';

    }

    public static void printGrade(double num1) {
        if (num1 >= 90)
            System.out.println('A');
        else if (num1 >= 80)
            System.out.println('B');
        else if (num1 >= 70)
            System.out.println('C');
        else if (num1 >= 60)
            System.out.println('D');
        else
            System.out.println('F');
    }


}