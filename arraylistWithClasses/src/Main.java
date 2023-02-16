import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1, "Engin", "Ar"));

        Customer ramiye = new Customer(1,"Ya","Ramiye");
        customers.add(ramiye);

        customers.add(new Customer(2, "Reçel", "Tahin Ersoğan"));

        customers.remove(ramiye);

        for(Customer customer:customers){
            System.out.println(customer.name);
        }


    }
}