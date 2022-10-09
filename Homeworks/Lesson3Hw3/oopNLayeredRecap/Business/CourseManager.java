package Homeworks.Lesson3Hw3.oopNLayeredRecap.Business;

import Homeworks.Lesson3Hw3.oopNLayeredRecap.Core.Logger;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.DataAccess.CourseDao;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.Entities.Course;

public class CourseManager {

    private CourseDao courseDao;
    private Logger logger;


    public CourseManager(CourseDao courseDao, Logger logger) {
        this.courseDao = courseDao;
        this.logger = logger;
    }

    public void add(Course course) throws Exception{

        for (Course c : courseDao.getAllCourses()) {

            if (c.getName().equals(course.getName())) {
                throw new Exception("İki kurs aynı isme sahip olamaz");
            }
        }

        if (course.getPrice()<0) {
            throw new Exception("Bir kursun fiyatı 10TL'den az olamaz.");
        } else {
            courseDao.add(course);
            logger.log(course.getName() + " adlı kurs eklendi.");
        }

        

        
    }

    public void delete(Course course) throws Exception{

        for (Course c : courseDao.getAllCourses()) {

            if (c.getName().equals(course.getName())) {
                courseDao.delete(course);
                logger.log(course.getName() + " adlı kurs silindi.");
                return;
            }
        }

        throw new Exception("Böyle bir kurs bulunmuyor");

        
    }
    
}
