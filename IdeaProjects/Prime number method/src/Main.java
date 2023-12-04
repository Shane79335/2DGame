// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       System.out.println("The first 50 prime numbers are \n");
       printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numoOfPrimes){
        final int NUMBER_OF_PRIMES_PER_LINES = 10;
        int count = 0;
        int number = 2;

        while(count<numoOfPrimes){
            if(isPrime(number)){
                count++;

            if(count % NUMBER_OF_PRIMES_PER_LINES == 0){
                System.out.printf("%-5d\n",number);
            }
            else
                System.out.printf("%-5d", number);
            }
            number++;
        }
    }

    public static boolean isPrime(int number){
        for(int divisor = 2; divisor <= number / 2; divisor++){
            if(number % divisor ==0){
                return false;
            }
        }
        return true;
    }
}