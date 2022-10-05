package Lessons.Lesson3.oopWithNLayeredApp;


import java.util.ArrayList;
import java.util.List;

import Lessons.Lesson3.oopWithNLayeredApp.Business.ProductManager;
import Lessons.Lesson3.oopWithNLayeredApp.Core.Logging.DatabaseLogger;
import Lessons.Lesson3.oopWithNLayeredApp.Core.Logging.FileLogger;
import Lessons.Lesson3.oopWithNLayeredApp.Core.Logging.Logger;
import Lessons.Lesson3.oopWithNLayeredApp.Core.Logging.MailLogger;
import Lessons.Lesson3.oopWithNLayeredApp.DataAccess.Concretes.HibernateProductDao;
import Lessons.Lesson3.oopWithNLayeredApp.DataAccess.Concretes.JdbcProductDao;
import Lessons.Lesson3.oopWithNLayeredApp.Entities.Concretes.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Iphone XR",9999);
        List<Logger> loggers = new ArrayList<Logger>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());

        ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);

        productManager.add(product1);
    }
}
