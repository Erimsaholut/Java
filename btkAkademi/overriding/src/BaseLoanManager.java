import java.lang.constant.Constable;

public class BaseLoanManager {
    public double calculate(double amount) {

        return amount * 2.11;
    }

    public final double welcomeLoan(double amount) {
        return amount*1.50;
    }
}
