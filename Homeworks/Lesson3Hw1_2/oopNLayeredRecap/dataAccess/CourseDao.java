package oopNLayeredRecap.dataAccess;

import java.util.List;

import oopNLayeredRecap.entities.Course;

public interface CourseDao {

    void add(Course course);

    List<Course> getAll();
}
