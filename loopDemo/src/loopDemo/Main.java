package loopDemo;

public class Main {

	public static void main(String[] args) {
		// For D�ng�s�
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("For D�ng�s� Bitti");

		for (int i = 0; i < 10; i += 2) {
			System.out.println("i = " + i);
		}
		System.out.println("-------------");
		// While D�ng�s�
		int i = 1;
		while (i < 10) {
			System.out.println("i = " + i);
			i++;  //sayac�n art���n� belirtmeliyiz, aksi halde sonsuz d�ng�ye girer
		}
		
		 //e�er ki tek say�lar� yazd�rmak isteseydim
		int j = 1;
		while (j < 10) {
			System.out.println("j = " + j);
			j+=2;  //sayac�n art���n� belirtmeliyiz, aksi halde sonsuz d�ng�ye girer
		}
		System.out.println("While D�ng�s� Bitti");
	}
}
