package kodlamaIO.entities;

public class Instructor {
	private int �nstructorId;
	private String �nstructorName;
	private String �nstructorLastName;
	
	public Instructor() {
		
	}
	
	public Instructor(int instructorId, String instructorName, String instructorLastName) {

		�nstructorId = instructorId;
		�nstructorName = instructorName;
		�nstructorLastName = instructorLastName;
	}
	
	public int getInstructorId() {
		return �nstructorId;
	}

	public void setInstructorId(int instructorId) {
		�nstructorId = instructorId;
	}

	public String getInstructorName() {
		return �nstructorName;
	}

	public void setInstructorName(String instructorName) {
		�nstructorName = instructorName;
	}

	public String getInstructorLastName() {
		return �nstructorLastName;
	}

	public void setInstructorLastName(String instructorLastName) {
		�nstructorLastName = instructorLastName;
	}


	
}
