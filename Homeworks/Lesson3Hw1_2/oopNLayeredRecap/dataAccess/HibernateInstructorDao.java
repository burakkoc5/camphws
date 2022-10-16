package oopNLayeredRecap.dataAccess;

import java.util.ArrayList;
import java.util.List;

import oopNLayeredRecap.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

    private List<Instructor> instructors = new ArrayList<>();

    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi");
        instructors.add(instructor);

    }

    public List<Instructor> getAll() {
        return instructors;
    }

}
