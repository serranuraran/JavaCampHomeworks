package kodlamaIO.business;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.abstracts.InstructorDao;
import kodlamaIO.entities.Instructor;

public class InstructorManager {
	
	private InstructorDao ýnstructorDao;
	private Logger[] loggers;
	
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		
		ýnstructorDao = instructorDao;
		this.loggers = loggers;
	}



	public void add(Instructor ýnstructor) {
		ýnstructorDao.add(ýnstructor);
		
		for (Logger logger : loggers) {
			logger.log(ýnstructor.getInstructorName() + " "+ ýnstructor.getInstructorLastName());
		}
	}
}
