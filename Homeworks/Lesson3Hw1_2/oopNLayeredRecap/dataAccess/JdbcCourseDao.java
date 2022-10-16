package oopNLayeredRecap.dataAccess;

import java.util.ArrayList;
import java.util.List;

import oopNLayeredRecap.entities.Course;

public class JdbcCourseDao implements CourseDao {

    private List<Course> courses = new ArrayList<>();

    @Override
    public void add(Course course) {
        // veritabanına ekleme kodları
        // simülasyon olarak array
        System.out.println("Jdbc ile veritabanına eklendi");
        courses.add(course);
    }

    public List<Course> getAll() {
        return courses;
    }

}
