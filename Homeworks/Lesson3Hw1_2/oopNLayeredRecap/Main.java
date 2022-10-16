package oopNLayeredRecap;

import oopNLayeredRecap.business.CategoryManager;
import oopNLayeredRecap.business.CourseManager;
import oopNLayeredRecap.business.InstructorManager;
import oopNLayeredRecap.core.Logging.DatabaseLogger;
import oopNLayeredRecap.core.Logging.FileLogger;
import oopNLayeredRecap.core.Logging.Logger;
import oopNLayeredRecap.core.Logging.MailLogger;
import oopNLayeredRecap.dataAccess.HibernateInstructorDao;
import oopNLayeredRecap.dataAccess.JdbcCategoryDao;
import oopNLayeredRecap.dataAccess.JdbcCourseDao;
import oopNLayeredRecap.entities.Category;
import oopNLayeredRecap.entities.Course;
import oopNLayeredRecap.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = new Logger[] { new MailLogger(), new FileLogger(), new DatabaseLogger() };

        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);

        Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ");
        Instructor instructor2 = new Instructor(2, "Burak", "Koç");
        Instructor instructor3 = new Instructor(2, "Bilgehan", "Tekin");

        instructorManager.add(instructor1);
        instructorManager.add(instructor2);
        instructorManager.add(instructor3);

        // instructorManager.add(instructor1);

        Course course1 = new Course(1, "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", 0);
        Course course2 = new Course(2, "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", 0);
        Course course3 = new Course(3, "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", -10); // eklenememesi lazım
                                                                                                  // fiyat 0 dan az

        courseManager.add(course1);
        courseManager.add(course2);
        // courseManager.add(course3);

        Category category1 = new Category(1, "Programlama", "Yazılım geliştirme kursları");
        Category category2 = new Category(2, "Tasarım", "Web ve mobil için tasarımcı kursları");

        categoryManager.add(category1);
        categoryManager.add(category2);

        // categoryManager.add(category2);

    }
}
