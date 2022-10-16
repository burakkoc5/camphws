package oopNLayeredRecap.business;

import oopNLayeredRecap.core.Logging.Logger;
import oopNLayeredRecap.dataAccess.InstructorDao;
import oopNLayeredRecap.entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        instructorDao.add(instructor);

        for (Logger logger : loggers) {
            logger.log(instructor.getFirstName());
        }

    }

}
