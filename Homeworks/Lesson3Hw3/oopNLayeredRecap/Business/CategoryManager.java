package Homeworks.Lesson3Hw3.oopNLayeredRecap.Business;

import Homeworks.Lesson3Hw3.oopNLayeredRecap.Core.Logger;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.DataAccess.CategoryDao;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.Entities.Category;

public class CategoryManager {

    private CategoryDao categoryDao;
    private Logger logger;

    public CategoryManager(CategoryDao categoryDao,Logger logger) {
        this.categoryDao = categoryDao;
        this.logger = logger;
    }

    public void add(Category category) throws Exception{

        for (Category c : categoryDao.getAllCategories()) {

            if (c.getName().equals(category.getName())) {
                throw new Exception("İki kategori aynı isme sahip olamaz");
            }
        }

        categoryDao.add(category);
        logger.log(category.getName() + "adlı kategori eklendi");

        
    }

    public void delete(Category category) throws Exception{

        for (Category c : categoryDao.getAllCategories()) {

            if (c.getName().equals(category.getName())) {
                categoryDao.delete(category);
                logger.log(category.getName() + "adlı kategori silindi");

                return;
            }
        }

        throw new Exception("Böyle bir kategori bulunmuyor");

        
    }

    
    
    
}
