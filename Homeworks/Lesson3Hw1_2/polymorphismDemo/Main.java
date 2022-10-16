package polymorphismDemo;

public class Main {
    public static void main(String[] args) {
        /*
         * BaseLogger[] loggers = new BaseLogger[] { new ConsoleLogger(), new
         * DatabaseLogger(), new EmailLogger(), new FileLogger() };
         * 
         * for (BaseLogger logger : loggers) {
         * logger.log("Log mesajı");
         * }
         */

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
