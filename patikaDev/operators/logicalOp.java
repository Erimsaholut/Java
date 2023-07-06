package operators;

public class logicalOp {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5;
        boolean condition1 = (a<b);
        boolean condition2 = (a>c);
        boolean result = condition1 && condition2;

        System.out.println(result);

        int d = (a>=c)?31:13;
        System.out.println(d);

    }
}
