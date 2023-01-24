public class Main {
    public static void main(String[] args) {
        TeacherLoanManager teacherLoanManager = new TeacherLoanManager();
        AgriculturalLoanManager agriculturalLoanManager = new AgriculturalLoanManager();
        LoanUI loanUI = new LoanUI();

        // teacherLoanManager.Calculate();
        // agriculturalLoanManager.Calculate();

        loanUI.LoanCalculate(new SoliderLoanManager());

    }
}