public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws BalanceInsufficentException {

        if (balance >= amount) {
            balance = getBalance() - amount;
        } else {
            //System.out.println("Not enough balance");
            //throw new Exception("Not enough balance");
            throw new BalanceInsufficentException("Insufficient balance");

        }
    }

    public double getBalance() {
        return balance;
    }
}
