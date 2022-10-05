package Lessons.Lesson3.oopWithNLayeredApp.Business;


import java.util.List;

import Lessons.Lesson3.oopWithNLayeredApp.Core.Logging.Logger;
import Lessons.Lesson3.oopWithNLayeredApp.DataAccess.Abstracts.ProductDao;
import Lessons.Lesson3.oopWithNLayeredApp.Entities.Concretes.Product;

public class ProductManager {

    private ProductDao productDao;
    private List<Logger> loggers;
    

    public ProductManager(ProductDao productDao, List <Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }



    public void add(Product product) throws Exception{
        //business logic
        //example:
        if (product.getUnitPrice()<10) {
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz ");
        }
        else if(product.getName().length()<2){
            throw new Exception("Ürün adı 2 harften kısa olamaz ");
        }
        productDao.add(product);

        for (Logger logger : loggers) {
            logger.log(product.getName());
        }

    }
}
