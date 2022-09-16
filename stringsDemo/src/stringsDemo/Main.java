package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel.";
		System.out.println(message);
		System.out.println("Eleman Sayýsý : " + message.length()); // mesajda 20 tane karakter olduðunu söylüyor
		System.out.println("5. Eleman : " + message.charAt(4)); // benim elimdeki string ifadenin 5.karakterini bulur.
																// ama 0'dan baþladýgýmýz icin 4. elemandýr
		System.out.println(message.concat(" Yaþasýn!"));
		System.out.println(message); // mesaj.concat aslýnda yeni bir string olusturuyor. eger onu daha sonra
										// kullanacaksanýz bir degiskene atamalýsýnýz
		System.out.println(message.startsWith("A")); // b deseydim yine false döndürürdü. küçük büyük harf duyarlý
														// oldugu icin
		System.out.println(message.endsWith("."));
		char[] karakterler = new char[5];
		message.getChars(0, 5, karakterler, 0); // 0 dan 5 e kadarki(5 dahil deðil) elemanlarý karakterlere ata demek.
												// en sondaki 0'ýn anlamý: karakterlere kaçtan baþlayayým atamaya
												// demek,ilk kacýncýyý aktarayým demek. karakterlerin 0. indexinden
												// itibaren aktar
		System.out.println(karakterler);
		System.out.println(message.indexOf('a')); // nu karakterin mesajýn içerisinde kaçýncý eleman olduðunu bulmaya
													// yarar. ilk bulduðunu verir ve operasyonu bitirir.
		System.out.println(message.indexOf("av")); // string olarak bir metni de arayabiliriz.
		System.out.println(message.lastIndexOf("e")); // aramaya en saðdan baþlýyor.
		System.out.println(message.replace(" ", "-")); // eski deðer,yeni deðer
		
		String yeniMesaj = message.replace(" ", "-");
		System.out.println(yeniMesaj);
		
		System.out.println(message.substring(2));  //mesajýn 2. indexinden itibaren parçala demek. kes
		
		System.out.println(message.substring(2, 5));   //sonuna kadar deðil de istediðimiz indexe kadar kesmesini istersek. 2den baþla 5e kadar(5 dahil degil)
		
		for (String kelime : message.split(" ")) {   //kelimeleri boþluða göre ayýr
			System.out.println(kelime);
		}
		
		System.out.println(message.toLowerCase());  //mesajý küçük harfe çevirir
		System.out.println(message.toUpperCase());   //büyük harfe çevirir
		System.out.println(message.trim());
	}

}