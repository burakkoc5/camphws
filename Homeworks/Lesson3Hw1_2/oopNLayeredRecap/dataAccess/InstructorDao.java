package oopNLayeredRecap.dataAccess;

import java.util.List;

import oopNLayeredRecap.entities.Instructor;

public interface InstructorDao {

    void add(Instructor instructor);

    List<Instructor> getAll();

}
