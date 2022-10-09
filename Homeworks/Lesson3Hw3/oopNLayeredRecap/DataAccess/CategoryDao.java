package Homeworks.Lesson3Hw3.oopNLayeredRecap.DataAccess;

import java.util.List;

import Homeworks.Lesson3Hw3.oopNLayeredRecap.Entities.Category;

public interface CategoryDao {
    void add(Category category);
    void delete(Category category);
    List<Category> getAllCategories();
}
