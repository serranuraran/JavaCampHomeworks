package kodlamaIO.business;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.abstracts.InstructorDao;
import kodlamaIO.entities.Instructor;

public class InstructorManager {
	
	private InstructorDao �nstructorDao;
	private Logger[] loggers;
	
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		
		�nstructorDao = instructorDao;
		this.loggers = loggers;
	}



	public void add(Instructor �nstructor) {
		�nstructorDao.add(�nstructor);
		
		for (Logger logger : loggers) {
			logger.log(�nstructor.getInstructorName() + " "+ �nstructor.getInstructorLastName());
		}
	}
}
