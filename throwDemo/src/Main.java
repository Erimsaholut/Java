public class Main {
    public static void main(String[] args) {
        AccountManager atm = new AccountManager();
        System.out.println("Account = $" + atm.getBalance());

        atm.deposit(250);
        System.out.println("Account = $" + atm.getBalance());

        try {
            atm.withdraw(300);
        } catch (BalanceInsufficentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Account = $" + atm.getBalance());
    }
}