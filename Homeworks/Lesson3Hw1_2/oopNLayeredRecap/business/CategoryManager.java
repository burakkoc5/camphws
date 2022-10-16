package oopNLayeredRecap.business;

import oopNLayeredRecap.core.Logging.Logger;
import oopNLayeredRecap.dataAccess.CategoryDao;
import oopNLayeredRecap.entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        for (Category c : categoryDao.getAll()) {
            if (category.getName().equals(c.getName())) {

                throw new Exception("Kategori isimleri aynı olamaz");
            }
        }
        categoryDao.add(category);

        for (Logger logger : loggers) {
            logger.log(category.getName());
        }

    }
}
