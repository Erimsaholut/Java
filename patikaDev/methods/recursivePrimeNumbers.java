package methods;

public class recursivePrimeNumbers {
    static int isPrime(int a, int b) {

        b = a - 1;


        if (b == 1) {
            System.out.println("PRime");
            return 1;
        } else if ((a / b) != 1) {
            return 0;
        }
        return isPrime(a, b);
    }


    public static void main(String[] args) {

        if (isPrime(35, 35) == 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not");
        }
        ;
    }
}
