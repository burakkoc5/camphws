package youtubeDemo;

public class Company extends Customer {
    private String companyName;
    private String taxNumber;

    public Company(int id, String city, String companyName, String taxNumber) {
        super(id, city);
        this.companyName = companyName;
        this.taxNumber = taxNumber;
    }

    public Company() {

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

}
