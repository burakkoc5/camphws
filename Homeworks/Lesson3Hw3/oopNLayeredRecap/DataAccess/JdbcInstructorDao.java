package Homeworks.Lesson3Hw3.oopNLayeredRecap.DataAccess;

import java.util.ArrayList;
import java.util.List;

import Homeworks.Lesson3Hw3.oopNLayeredRecap.Entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

    private List<Instructor> instructors = new ArrayList<>();

    @Override
    public void add(Instructor instructor) {

        instructors.add(instructor);
        System.out.println(instructor.getFirstName() + " " + instructor.getNationalityId() + " TC'li kullanıcı JDBC ile eklendi");
    }

    @Override
    public void delete(Instructor instructor) {
        instructors.remove(instructor);
        System.out.println(instructor.getFirstName() + " " + instructor.getNationalityId() + " TC'li kullanıcı JDBC ile silindi");
        
    }

    @Override
    public List<Instructor> getAllInstructors() {
        // TODO Auto-generated method stub
        return instructors;
    }
    
}
