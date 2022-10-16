package oopNLayeredRecap.dataAccess;

import java.util.ArrayList;
import java.util.List;

import oopNLayeredRecap.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

    private List<Category> categories = new ArrayList<>();

    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi");
        categories.add(category);

    }

    public List<Category> getAll() {
        return categories;
    }

}
