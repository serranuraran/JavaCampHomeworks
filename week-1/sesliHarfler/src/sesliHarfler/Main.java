package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'A';
		switch (harf) {
		case 'A':
		case 'U':
		case 'I':
		case 'O':
			System.out.println("Kal�n Sesli Harf");
			break;
		default:
			System.out.println("�nce Sesli Harf");
			break;
		}

	}
}