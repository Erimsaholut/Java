public class Main {
    public static void main(String[] args) {
        OfficerLoanManager teacherLoanManager = new OfficerLoanManager();
        System.out.println("Last amount: " + teacherLoanManager.calculate(100));

        System.out.println("-------------------");

        BaseLoanManager[] baseLoanManager = new BaseLoanManager[]{new OfficerLoanManager(), new SoldierLoanManager(), new EducationLoanManager()};
        for (BaseLoanManager loans : baseLoanManager) {
            System.out.println("Loan:" + loans.calculate(300));
            System.out.println("Welcome Loan: "+ loans.welcomeLoan(300)+"\n");
        }

    }
}