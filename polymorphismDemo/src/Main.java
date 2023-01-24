import java.io.File;

public class Main {
    public static void main(String[] args) {
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.Log("rte1954@gmail.com");

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.Log("products.db");

        FileLogger fileLogger = new FileLogger();
        fileLogger.Log("logogogo");

        System.out.println("-----------------------------------");

        BaseLogger[] baseLoggers = new BaseLogger[]{new FileLogger(), new DatabaseLogger(), new EmailLogger(), new ConsoleLogger()};

        for (BaseLogger logger : baseLoggers) {
            logger.Log("Log message");
        }

        System.out.println("-----------------------------------");

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.Add();

    }
}