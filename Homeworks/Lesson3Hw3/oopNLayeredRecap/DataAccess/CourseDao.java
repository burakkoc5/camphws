package Homeworks.Lesson3Hw3.oopNLayeredRecap.DataAccess;

import java.util.List;

import Homeworks.Lesson3Hw3.oopNLayeredRecap.Entities.Course;

public interface CourseDao {
    public void add(Course course);

    public void delete(Course course);

    public List<Course> getAllCourses();
}
