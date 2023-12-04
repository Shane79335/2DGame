// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int [] list = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,20,25,26,28,30,33};
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a key to search for: ");
        int  key = input.nextInt();
        int answer = binSort(list, key);
        if(answer < 0)
            System.out.println(key + " was not found");
        else
            System.out.println(key + " was at entry " + (answer + 1));
    }

    public static int binSort(int [] list,int key)
    {
        int low = 0;
        int high = list.length - 1;
        while (high >= low){
            int mid = (low + high) / 2;
            if(key < list[mid])
                high = mid -1;
            else if (key == list[mid])
                return mid;
            else
                low = mid+1;
        }
        return  -low-1;
    }
}