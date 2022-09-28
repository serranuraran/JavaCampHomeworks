package methods2;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel.";
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
		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {  //void yerine int yazdým bu þu demek : bu fonksiyon integer türünde bir deðer döndürür demek
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {   //istediðimiz kadar sayý verebiliriz, birden fazla integer göndericem demek istiyorsanýz ... koyuyoruz int'in sonuna.
		int toplam = 0;
		for (int sayi : sayilar) {        //sayýlardaki herbir sayý icin
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
