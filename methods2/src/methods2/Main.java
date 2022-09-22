package methods2;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bug�n hava �ok g�zel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15, 7);
		System.out.println(sayi);

		int toplam = topla2(2, 3, 4, 5, 6, 10);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("G�ncellendi");
	}

	public static int topla(int sayi1, int sayi2) {  //void yerine int yazd�m bu �u demek : bu fonksiyon integer t�r�nde bir de�er d�nd�r�r demek
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {   //istedi�imiz kadar say� verebiliriz, birden fazla integer g�ndericem demek istiyorsan�z ... koyuyoruz int'in sonuna.
		int toplam = 0;
		for (int sayi : sayilar) {        //say�lardaki herbir say� icin
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
