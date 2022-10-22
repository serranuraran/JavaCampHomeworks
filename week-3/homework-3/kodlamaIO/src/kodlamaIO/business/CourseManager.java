package kodlamaIO.business;

import java.util.List;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.abstracts.CourseDao;
import kodlamaIO.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;
	

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}


	public void add(Course course) throws Exception {
		if(course.getCoursePrice()<0) {
			throw new Exception(" kursun fiyatý 0 dan küçük olamaz");
		}
	for(Course crs : courses) {
		if (crs.getCourseName().equals(course.getCourseName())) {
			throw new Exception("Kurs ismi tekrar edemez");
		}
	}
	courseDao.add(course);
	courses.add(course);
	
	for (Logger logger : loggers) {
		logger.log(course.getCourseName());
	}
	
	}
}
