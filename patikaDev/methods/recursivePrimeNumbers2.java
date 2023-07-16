package methods;


public class recursivePrimeNumbers2 {
    static int isPrime(int a) {
        return isPrimeHelper(a, a - 1);
    }

    static int isPrimeHelper(int a, int b) {
        if (b == 1) {
            System.out.println(a + " is Prime");
            return 1;
        } else if (a % b == 0) {
            System.out.println(a + " is not Prime");
            return 0;
        }
        return isPrimeHelper(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(97));
    }
}
