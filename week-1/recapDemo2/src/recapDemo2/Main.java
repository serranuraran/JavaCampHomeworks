package recapDemo2;

public class Main {

	public static void main(String[] args) {
		int sayi1=24;
		int sayi2=25;
		int sayi3=2;
		int enBuyuk=sayi1;       //bu, en büyük sayýyý tutan deðiþkenimiz olacak
		
		if (enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		
		if (enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		
		System.out.println("En büyük = "+enBuyuk);

	}

}
