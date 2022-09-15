package loopDemo;

public class Main {

	public static void main(String[] args) {
		// For Döngüsü
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("For Döngüsü Bitti");

		for (int i = 0; i < 10; i += 2) {
			System.out.println("i = " + i);
		}
		System.out.println("-------------");
		// While Döngüsü
		int i = 1;
		while (i < 10) {
			System.out.println("i = " + i);
			i++;  //sayacýn artýþýný belirtmeliyiz, aksi halde sonsuz döngüye girer
		}
		
		 //eðer ki tek sayýlarý yazdýrmak isteseydim
		int j = 1;
		while (j < 10) {
			System.out.println("j = " + j);
			j+=2;  //sayacýn artýþýný belirtmeliyiz, aksi halde sonsuz döngüye girer
		}
		System.out.println("While Döngüsü Bitti");
	}
}
