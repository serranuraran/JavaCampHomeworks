package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3]; // 3 b�lge 3 �ehirden olusan dizi. //3x3 9 eleman olacak
		sehirler[0][0] = "�stanbul"; // 0.sat�r 0.s�tun
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "K�r�kkale";
		sehirler[2][0] = "Diyarbak�r";
		sehirler[2][1] = "�anl�urfa";
		sehirler[2][2] = "Mardin";

		//nested loop:i� i�e d�ng�
		for (int i = 0; i < sehirler.length; i++) {
			System.out.println("-----------------");
			for (int j = 0; j < sehirler[i].length; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}
}