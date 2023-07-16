package methods;

public class recursiveDesign {
    static void fives(int a) {
        int b = a;

        while (b > 0) {
            b = fivesSub(b);
        }
        while (b != a) {
            b = fivesAdd(b);
        }
    }

    static int fivesAdd(int b) {
        System.out.println(b + 5);
        return (b + 5);

    }

    static int fivesSub(int b) {
        System.out.println(b - 5);
        return (b - 5);

    }


    public static void main(String[] args) {
        fives(25);
    }
}
