package kodlamaIO.core.logging;

public class EmailLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Mail g�nderildi : " + message);
		
	}

}
