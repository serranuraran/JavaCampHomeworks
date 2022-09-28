package methods;

public class Main {

	public static void main(String[] args) {
		SayiBulmaca();     //say�bulmaca'y� �a��r.
		SayiBulmaca();
		SayiBulmaca();
		SayiBulmaca();

	}

	public static void SayiBulmaca() { //metodumuzun fonksiyonumuzun ismi SayiBulmaca
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		String mesaj = "";
		if (varMi) {
			mesaj = "Sayi bulundu : " + aranacak;
			mesajVer(mesaj);
		} else {
			mesaj = "Sayi bulunamad� : " + aranacak;
			mesajVer(mesaj);
		}
	}

	public static void mesajVer(String mesaj) {     //parametreli metot 
		System.out.println(mesaj);
	}
	

}
