package Lessons.Lesson2OOP;

public class Main {
    public static void main(String[] args) {

        // -----------------Product1----------------------------------
        // Objeyi tanımlama
        Product product1 = new Product();

        // Fieldlara değer atama işlemi = SET
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscountRate( 7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("bilmemne.jpg");

        // Fieldları okuma işlemi = GET

        // System.out.println(product1.name);

        // -----------------Product2----------------------------------
        // Objeyi tanımlama
        Product product2 = new Product();

        // Fieldlara değer atama işlemi = SET
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscountRate(8);
        product2.setUnitsInStock(2);
        product2.setImageUrl("bilmemne2.jpg"); 

        // -----------------Product3----------------------------------
        // Objeyi tanımlama
        Product product3 = new Product();

        // Fieldlara değer atama işlemi = SET
        product3.setName( "Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscountRate( 9);
        product3.setUnitsInStock( 4);
        product3.setImageUrl("bilmemne3.jpg");


        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>"+product.getName() + " = " + product.getUnitPrice() + " TL" + "</li>");    
        }
        System.out.println("</ul>");

        //-------------------------------------------------------

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhoneNumber("05395554444");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demiroğ");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhoneNumber("03123125555");
        corporateCustomer.setCustomerNumber("123456");
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setTaxNumber("012354");

    }
}
