package kodlamaIO.dataAccess.concretes;

import kodlamaIO.dataAccess.abstracts.InstructorDao;
import kodlamaIO.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanýna eklendi");
		
	}

}
