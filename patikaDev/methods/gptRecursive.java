package methods;

public class gptRecursive {
    static void printPattern(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        printPattern(n - 5);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.print("Çıktısı: ");
        printPattern(n);
    }
}

