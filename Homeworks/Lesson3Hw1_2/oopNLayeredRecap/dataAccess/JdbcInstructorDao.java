package oopNLayeredRecap.dataAccess;

import java.util.ArrayList;
import java.util.List;

import oopNLayeredRecap.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

    private List<Instructor> instructors = new ArrayList<>();

    @Override
    public void add(Instructor instructor) {
        // veritabanına ekleme kodları
        // simülasyon olarak array
        System.out.println("Jdbc ile veritabanına eklendi");
        instructors.add(instructor);
    }

    @Override
    public List<Instructor> getAll() {
        // TODO Auto-generated method stub
        return instructors;
    }

}
