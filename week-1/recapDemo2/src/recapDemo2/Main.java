package recapDemo2;

public class Main {

	public static void main(String[] args) {
		int sayi1=24;
		int sayi2=25;
		int sayi3=2;
		int enBuyuk=sayi1;       //bu, en b�y�k say�y� tutan de�i�kenimiz olacak
		
		if (enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		
		if (enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		
		System.out.println("En b�y�k = "+enBuyuk);

	}

}
