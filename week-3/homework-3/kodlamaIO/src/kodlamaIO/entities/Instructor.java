package kodlamaIO.entities;

public class Instructor {
	private int ýnstructorId;
	private String ýnstructorName;
	private String ýnstructorLastName;
	
	public Instructor() {
		
	}
	
	public Instructor(int instructorId, String instructorName, String instructorLastName) {

		ýnstructorId = instructorId;
		ýnstructorName = instructorName;
		ýnstructorLastName = instructorLastName;
	}
	
	public int getInstructorId() {
		return ýnstructorId;
	}

	public void setInstructorId(int instructorId) {
		ýnstructorId = instructorId;
	}

	public String getInstructorName() {
		return ýnstructorName;
	}

	public void setInstructorName(String instructorName) {
		ýnstructorName = instructorName;
	}

	public String getInstructorLastName() {
		return ýnstructorLastName;
	}

	public void setInstructorLastName(String instructorLastName) {
		ýnstructorLastName = instructorLastName;
	}


	
}
