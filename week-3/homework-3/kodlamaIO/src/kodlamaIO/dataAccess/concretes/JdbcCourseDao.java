package kodlamaIO.dataAccess.concretes;

import kodlamaIO.dataAccess.abstracts.CourseDao;
import kodlamaIO.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veritabanýna eklendi");
		
	}

}
