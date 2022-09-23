package Homeworks.Lesson2Hw2.LearningClasses.FieldsAttributesAndEncapsulation;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Lenovo ideapad GAMING",20000,3,"Black");
        
        /*product.setName("Laptop");
        product.setId(1);
        product.setDescription("Lenovo ideapad GAMING");
        product.setPrice(20000);
        product.setStockAmount(3);
        System.out.println(product.getName());*/

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
    
}
