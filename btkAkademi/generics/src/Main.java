public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator();
        Customer customer = new Customer();
        CustomerDal customerDal = new CustomerDal();

        validator.validate(customer);
    }
}