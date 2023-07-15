package methods;


public class recursive {

    public static void main(String[] args) {


        System.out.println(f(10));
    }

    static int f(int a) {
        if (a == 1) {
            return 1;
        }
        return a + f(a - 1);
    }
}
