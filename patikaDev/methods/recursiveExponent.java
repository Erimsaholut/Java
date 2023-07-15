package methods;

public class recursiveExponent {
    static int exp(int a, int b) {

        if (b == 1) {
            return a;
        }

        return a * exp(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(exp(2, 5));

    }
}
