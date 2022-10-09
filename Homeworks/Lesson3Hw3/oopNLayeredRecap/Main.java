package Homeworks.Lesson3Hw3.oopNLayeredRecap;

import Homeworks.Lesson3Hw3.oopNLayeredRecap.Business.CategoryManager;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.Business.CourseManager;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.Business.InstructorManager;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.Core.DatabaseLogger;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.Core.FileLogger;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.Core.MailLogger;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.DataAccess.HibernateInstructorDao;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.DataAccess.JdbcCategoryDao;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.DataAccess.JdbcCourseDao;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.Entities.Category;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.Entities.Course;
import Homeworks.Lesson3Hw3.oopNLayeredRecap.Entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {

        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), new FileLogger());

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), new DatabaseLogger());

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), new MailLogger());



        Instructor instructor1= new Instructor(1, "Engin", "Demiroğ", "11111111111");
        Instructor instructor2= new Instructor(2, "Burak", "Koç", "11111111112");
        Instructor instructor3 = new Instructor(2, "Bilgehan", "Tekin", "11111111113");

        instructorManager.add(instructor1);
        instructorManager.add(instructor2);
        instructorManager.add(instructor3);

        //instructorManager.add(instructor1);



        Course course1 = new Course(1, "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", 0);
        Course course2 = new Course(2, "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", 0);
        Course course3 = new Course(3, "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", -10); // eklenememsi lazım fiyat 0 dan az

        courseManager.add(course1);
        courseManager.add(course2);
        //courseManager.add(course3);


        Category category1 = new Category(1, "Programlama", "Yazılım geliştirme kursları");
        Category category2 = new Category(2, "Tasarım", "Web ve mobil için tasarımcı kursları");

        categoryManager.add(category1);
        categoryManager.add(category2);

        //categoryManager.add(category2);





    }
}
