package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;   //artýk aramasýna gerek yok, döngüyü bitir
			}
		}

		if (varMi) {
			System.out.println("Sayý bulundu");
		} else {
			System.out.println("Sayý bulunamadý");
		}
	}
}