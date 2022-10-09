package Homeworks.Lesson3Hw3.oopNLayeredRecap.Business;

import Homeworks.Lesson3Hw3.oopNLayeredRecap.Core.Logger;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.DataAccess.InstructorDao;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.Entities.Instructor;

public class InstructorManager {

    private InstructorDao instructorDao;
    private Logger logger;

    public InstructorManager(InstructorDao instructorDao, Logger logger) {
        this.instructorDao = instructorDao;
        this.logger = logger;
    }

    public void add(Instructor instructor) throws Exception{

        for (Instructor i : instructorDao.getAllInstructors()) {
            if (i.getNationalityId().equals(instructor.getNationalityId())) {
                throw new Exception("Aynı kişiyi 2 kere ekleyemezsiniz");

            }
        }

        instructorDao.add(instructor);
        logger.log(instructor.getFirstName()+ " "+instructor.getLastName() +" / "+instructor.getNationalityId());
   
    }

    public void delete(Instructor instructor) throws Exception{

        for (Instructor i : instructorDao.getAllInstructors()) {

            if (i.getNationalityId().equals(instructor.getNationalityId())) {
                instructorDao.delete(instructor);
                System.out.println("Kişi silindi");
                logger.log(instructor.getFirstName()+ " "+instructor.getLastName() +" / "+instructor.getNationalityId() + " silindi");
                return;
            }
        }

        throw new Exception("Böyle bir kurs bulunmuyor");

        
    }
    
}
