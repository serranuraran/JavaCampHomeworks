package kodlamaIO;

import java.util.ArrayList;
import java.util.List;

import kodlamaIO.business.CategoryManager;
import kodlamaIO.business.CourseManager;
import kodlamaIO.business.InstructorManager;
import kodlamaIO.core.logging.DatabaseLogger;
import kodlamaIO.core.logging.EmailLogger;
import kodlamaIO.core.logging.FileLogger;
import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.concretes.HibernateCategoryDao;
import kodlamaIO.dataAccess.concretes.HibernateInstructorDao;
import kodlamaIO.dataAccess.concretes.JdbcCourseDao;
import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};
		
		Course course1 = new Course(1, "Java", 0);
		Course course2 = new Course(2, "Java", 0);
		
		List<Course> courseDb = new ArrayList<>();
		
		CourseManager courseManager=new CourseManager(new JdbcCourseDao(),loggers,courseDb);
		courseManager.add(course1);
		//courseManager.add(course2);
		
		Category category1 = new Category(1, "Yazýlým");
		Category category2 = new Category(2, "Yazýlým");
		
		List<Category> categoryDb = new ArrayList<>();
		
		CategoryManager categoryManager=new CategoryManager( categoryDb,new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		//categoryManager.add(category2);
		
		Instructor ýnstructor1 = new Instructor(1, "Engin", "Demiroð");
		InstructorManager ýnstructorManager=new InstructorManager(new HibernateInstructorDao(), loggers);
		ýnstructorManager.add(ýnstructor1);
	}

}
