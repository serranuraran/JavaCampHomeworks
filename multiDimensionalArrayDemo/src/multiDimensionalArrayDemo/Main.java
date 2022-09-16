package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3]; // 3 bölge 3 þehirden olusan dizi. //3x3 9 eleman olacak
		sehirler[0][0] = "Ýstanbul"; // 0.satýr 0.sütun
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kýrýkkale";
		sehirler[2][0] = "Diyarbakýr";
		sehirler[2][1] = "Þanlýurfa";
		sehirler[2][2] = "Mardin";

		//nested loop:iç içe döngü
		for (int i = 0; i < sehirler.length; i++) {
			System.out.println("-----------------");
			for (int j = 0; j < sehirler[i].length; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}
}