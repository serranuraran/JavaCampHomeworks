package kodlamaIO.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Veritaban�na Logland� : " + message);
		
	}

}
