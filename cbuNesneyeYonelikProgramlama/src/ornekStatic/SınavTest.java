package ornekStatic;

public class SınavTest {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println(x + y);
        System.out.println("x = " + x + " y = " + y + " x + y = " + (x + y));
        System.out.println("x++ = " + x++ + " ++y = " + ++y + " x + y = " + (x + y));
        x = 5;
        y = 10;
        System.out.println("x+++y = " + (x++ + y));
        System.out.println("x = " + x);
    }
}
