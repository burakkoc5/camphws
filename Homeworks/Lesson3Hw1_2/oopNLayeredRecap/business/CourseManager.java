package oopNLayeredRecap.business;

import oopNLayeredRecap.core.Logging.Logger;
import oopNLayeredRecap.dataAccess.CourseDao;
import oopNLayeredRecap.entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        for (Course c : courseDao.getAll()) {
            if (course.getName().equals(c.getName())) {

                throw new Exception("Kurs isimleri aynı olamaz");
            } else if (course.getUnitPrice() < 0) {

                throw new Exception("Kurs fiyatı 0 dan küçük olamaz");
            }
        }
        courseDao.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getName());
        }
    }
}
