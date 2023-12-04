import java.util.*;
//sqrt(double a)
//Math.sqrt(10.5) returns 3.24

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the coordinates of 2 points, separated by spaces ");
        System.out.print(" for example:  1 1 6.5 1 6.5 2.5");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //compute sides)
        double a = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        double b = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        double c = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));


        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c)/(-2*b*c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c)/(-2*a*c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a)/(-2*a*b)));

        //Display results
         System.out.println("THe three angles are" +
          Math.round(A * 100)/ 100.0+ " " +
          Math.round(B * 100)/ 100.0+ " " +
          Math.round(C + 100)/ 100.0);
    }
}