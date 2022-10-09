package Homeworks.Lesson3Hw3.oopNLayeredRecap.DataAccess;

import java.util.ArrayList;
import java.util.List;

import Homeworks.Lesson3Hw3.oopNLayeredRecap.Entities.Category;

public class HibernateCategoryDao implements CategoryDao{

    private List<Category> categories = new ArrayList<>();
 
    @Override
    public void add(Category category) {

        System.out.println(category.getName() + " adlı kategori hibernate ile eklendi");
        categories.add(category);
    }

    @Override
    public void delete(Category category) {
        System.out.println(category.getName() + " adlı kategori hibernate ile silindi.");
        categories.remove(category);
        
    }

    @Override
    public List<Category> getAllCategories() {
        // TODO Auto-generated method stub
        return categories;
    }

    
}
