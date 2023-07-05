package DataTypes;

public class basicOperators {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println(a % b);   // + - * / %
        b = b + 1;
        b += 1;
        b -= 1;
        b *= 1;
        b /= 1;
        b %= 1;

        boolean myBool = (b == 0);
        boolean myBool2 = (b >= 0);
        boolean myBool3 = (b == 0 && a != 5);
        boolean myBool4 = (b == 0 || a != 5);

        System.out.println(myBool);
        System.out.println(myBool2);
        System.out.println(myBool3);
        System.out.println(myBool4);


    }
}
