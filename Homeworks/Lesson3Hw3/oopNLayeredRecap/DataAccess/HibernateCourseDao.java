package Homeworks.Lesson3Hw3.oopNLayeredRecap.DataAccess;

import java.util.ArrayList;
import java.util.List;

import Homeworks.Lesson3Hw3.oopNLayeredRecap.Entities.Course;

public class HibernateCourseDao  implements CourseDao{

    private List<Course> courses = new ArrayList<>();

    @Override
    public void add(Course course) {
        // TODO Auto-generated method stub
        courses.add(course);
        System.out.println("Kurs hibernate ile eklendi");
        
    }

    @Override
    public void delete(Course course) {
        courses.remove(course);
        System.out.println("Kurs hibernate ile silindi.");
        
    }

    @Override
    public List<Course> getAllCourses() {
        // TODO Auto-generated method stub
        return courses;
    }
    
}
