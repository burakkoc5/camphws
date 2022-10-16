package oopNLayeredRecap.dataAccess;

import java.util.ArrayList;
import java.util.List;

import oopNLayeredRecap.entities.Course;

public class HibernateCourseDao implements CourseDao {

    private List<Course> courses = new ArrayList<>();

    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi");
        courses.add(course);

    }

    public List<Course> getAll() {
        return courses;
    }
}
