package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'B';
		switch (grade) // switch blo�unun i�erisine �art�m�z�n �znesini yaz�yoruz
		{
		case 'A':
			System.out.println("M�kemmel : Ge�tiniz!");
			break;
		case 'B':   //B ve C i�in ayn� ��kt�y� vermek istiyorsan�z bu �ekilde yazabilirsiniz
		case 'C':
			System.out.println("�yi : Ge�tiniz.");
			break;
		case 'D':
			System.out.println("Fena De�il : Ge�tiniz");
		case 'F':
			System.out.println("Maalesef : Kald�n�z.");
			break;
		default: // kullan�c� �stteki notlar�n d���nda bir not girerse
			System.out.println("Ge�ersiz not girdiniz.");
		}
	}
}