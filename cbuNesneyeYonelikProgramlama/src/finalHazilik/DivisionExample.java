package finalHazilik;

class ZeroDivisorException extends Exception {
    public ZeroDivisorException(String message) {
        super(message);
    }
}

public class DivisionExample {
    public static double divide(int numerator, int denominator) throws ZeroDivisorException {
        if (denominator == 0) {
            throw new ZeroDivisorException("Kural dışı durum: Bölen sıfır");
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            double result = divide(numerator, denominator);
            System.out.println("Sonuç: " + result);
        } catch (ZeroDivisorException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
