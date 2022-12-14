package kodlamaIO.business;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.abstracts.InstructorDao;
import kodlamaIO.entities.Instructor;

public class InstructorManager {
	
	private InstructorDao żnstructorDao;
	private Logger[] loggers;
	
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		
		żnstructorDao = instructorDao;
		this.loggers = loggers;
	}



	public void add(Instructor żnstructor) {
		żnstructorDao.add(żnstructor);
		
		for (Logger logger : loggers) {
			logger.log(żnstructor.getInstructorName() + " "+ żnstructor.getInstructorLastName());
		}
	}
}
