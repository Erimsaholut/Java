public class OutsourceWorker implements IWorkable,IEatable{
    @Override
    public void work() {
        System.out.println("Oursource Worker");
    }

    @Override
    public void eat() {
        System.out.println("");
    }
}
