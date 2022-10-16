package youtubeDemo;

public class Main {
    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer(0, null);
        customer.setId(1);
        customer.setCity("Ankara");

        Company company = new Company();
        company.setTaxNumber("100000");
        company.setCity("Ankara");
        company.setCompanyName("Arçelik");
        company.setId(1);

        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();

        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.giveCredit();

    }
}
