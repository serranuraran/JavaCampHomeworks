package kodlamaIO.entities;

public class Instructor {
	private int żnstructorId;
	private String żnstructorName;
	private String żnstructorLastName;
	
	public Instructor() {
		
	}
	
	public Instructor(int instructorId, String instructorName, String instructorLastName) {

		żnstructorId = instructorId;
		żnstructorName = instructorName;
		żnstructorLastName = instructorLastName;
	}
	
	public int getInstructorId() {
		return żnstructorId;
	}

	public void setInstructorId(int instructorId) {
		żnstructorId = instructorId;
	}

	public String getInstructorName() {
		return żnstructorName;
	}

	public void setInstructorName(String instructorName) {
		żnstructorName = instructorName;
	}

	public String getInstructorLastName() {
		return żnstructorLastName;
	}

	public void setInstructorLastName(String instructorLastName) {
		żnstructorLastName = instructorLastName;
	}


	
}
