public class Worker implements IWorkable, IEatable, IPayable {

    @Override
    public void work() {
        System.out.println("Our Workers");
    }

    @Override
    public void eat() {
        System.out.println("Can eat in cafeteria");

    }

    @Override
    public void pay() {
        System.out.println("Gived paycheck");

    }
}
