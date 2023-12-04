// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[][] matrix = new  int[10][10];
        matrix[0][0] =3;
        for( int i = 0;i < matrix.length;i++)
            for(int j=0;j < matrix[i].length;j++)
                matrix[i][j] = (int)(Math.random() * 1000);
    }
}