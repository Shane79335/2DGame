// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("         Multiplication Table");

        System.out.print("    ");
        for (int j = 1; j <= 9; j++)
            System.out.print("   " + j);
        System.out.println("\n---------------------------------------------");

        for(int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

    }
}