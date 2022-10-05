package Lessons.Lesson3.oopWithNLayeredApp.DataAccess.Concretes;

import Lessons.Lesson3.oopWithNLayeredApp.DataAccess.Abstracts.ProductDao;
import Lessons.Lesson3.oopWithNLayeredApp.Entities.Concretes.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){

        //only data access codes
        
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
