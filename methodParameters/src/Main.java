public class Main {
    public static void main(String[] args) {
        int a = 5, b = 31;
        System.out.println(sum(a,b));
        message();

        System.out.println(sum2(1, 2, 3, 4, 5, 6, 7, 8, 9*6, 10));
        message();
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum2(int... numbers) {
        int total = 0;
        for (int x : numbers)
            total += x;
        return total;
    }

    public static void message() {
        System.out.println("Calculated !");
    }
}