package oopNLayeredRecap.dataAccess;

import java.util.ArrayList;
import java.util.List;

import oopNLayeredRecap.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

    private List<Category> categories = new ArrayList<>();

    @Override
    public void add(Category category) {
        // veritabanına ekleme kodları
        // simülasyon olarak array
        System.out.println("Jdbc ile veritabanına eklendi");
        categories.add(category);
    }

    public List<Category> getAll() {
        return categories;
    }

}
