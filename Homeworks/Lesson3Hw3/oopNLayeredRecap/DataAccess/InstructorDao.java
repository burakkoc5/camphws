package Homeworks.Lesson3Hw3.oopNLayeredRecap.DataAccess;

import java.util.List;

import Homeworks.Lesson3Hw3.oopNLayeredRecap.Entities.Instructor;

public interface InstructorDao {

    public void add(Instructor instructor);
    public void delete(Instructor instructor);
    public List<Instructor> getAllInstructors();
    
}
