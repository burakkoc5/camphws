package Lessons.Lesson2OOP;

public class Product {
    //Fields of product object
    //Class adı PascalCase
    //Fieldlar camelCase
    private String name;
    private double unitPrice;
    private double discountRate;
    private String imageUrl;
    private int unitsInStock;

    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public double getDiscountRate(){
        return discountRate;
    }

    public void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    public int getUnitsInStock(){
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock){
        this.unitsInStock = unitsInStock;
    }



}
