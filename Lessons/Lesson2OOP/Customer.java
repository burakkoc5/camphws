package Lessons.Lesson2OOP;

/**
 * Customer
 */
public class Customer {
    private int id;

    private String customerNumber;

    private String phoneNumber;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerNumber(String customerNumber){
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber(){
        return customerNumber;
    }

    


}