package oopNLayeredRecap.dataAccess;

import java.util.List;

import oopNLayeredRecap.entities.Category;

public interface CategoryDao {

    void add(Category category);

    List<Category> getAll();
}
