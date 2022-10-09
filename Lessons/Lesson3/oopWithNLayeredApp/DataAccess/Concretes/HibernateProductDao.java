package Lessons.Lesson3.oopWithNLayeredApp.DataAccess.Concretes;

import Lessons.Lesson3.oopWithNLayeredApp.DataAccess.Abstracts.ProductDao;
import Lessons.Lesson3.oopWithNLayeredApp.Entities.Concretes.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){

        //only data access codes
        //Hİbernate nrew fndljafnsalfafşa
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
    
}
