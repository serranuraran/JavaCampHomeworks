package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;   //art�k aramas�na gerek yok, d�ng�y� bitir
			}
		}

		if (varMi) {
			System.out.println("Say� bulundu");
		} else {
			System.out.println("Say� bulunamad�");
		}
	}
}