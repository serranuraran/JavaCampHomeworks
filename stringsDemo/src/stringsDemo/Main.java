package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message = "Bug�n hava �ok g�zel.";
		System.out.println(message);
		System.out.println("Eleman Say�s� : " + message.length()); // mesajda 20 tane karakter oldu�unu s�yl�yor
		System.out.println("5. Eleman : " + message.charAt(4)); // benim elimdeki string ifadenin 5.karakterini bulur.
																// ama 0'dan ba�lad�g�m�z icin 4. elemand�r
		System.out.println(message.concat(" Ya�as�n!"));
		System.out.println(message); // mesaj.concat asl�nda yeni bir string olusturuyor. eger onu daha sonra
										// kullanacaksan�z bir degiskene atamal�s�n�z
		System.out.println(message.startsWith("A")); // b deseydim yine false d�nd�r�rd�. k���k b�y�k harf duyarl�
														// oldugu icin
		System.out.println(message.endsWith("."));
		char[] karakterler = new char[5];
		message.getChars(0, 5, karakterler, 0); // 0 dan 5 e kadarki(5 dahil de�il) elemanlar� karakterlere ata demek.
												// en sondaki 0'�n anlam�: karakterlere ka�tan ba�layay�m atamaya
												// demek,ilk kac�nc�y� aktaray�m demek. karakterlerin 0. indexinden
												// itibaren aktar
		System.out.println(karakterler);
		System.out.println(message.indexOf('a')); // nu karakterin mesaj�n i�erisinde ka��nc� eleman oldu�unu bulmaya
													// yarar. ilk buldu�unu verir ve operasyonu bitirir.
		System.out.println(message.indexOf("av")); // string olarak bir metni de arayabiliriz.
		System.out.println(message.lastIndexOf("e")); // aramaya en sa�dan ba�l�yor.
		System.out.println(message.replace(" ", "-")); // eski de�er,yeni de�er
		
		String yeniMesaj = message.replace(" ", "-");
		System.out.println(yeniMesaj);
		
		System.out.println(message.substring(2));  //mesaj�n 2. indexinden itibaren par�ala demek. kes
		
		System.out.println(message.substring(2, 5));   //sonuna kadar de�il de istedi�imiz indexe kadar kesmesini istersek. 2den ba�la 5e kadar(5 dahil degil)
		
		for (String kelime : message.split(" ")) {   //kelimeleri bo�lu�a g�re ay�r
			System.out.println(kelime);
		}
		
		System.out.println(message.toLowerCase());  //mesaj� k���k harfe �evirir
		System.out.println(message.toUpperCase());   //b�y�k harfe �evirir
		System.out.println(message.trim());
	}

}