package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		//bug
		int number=2;
		int remainder = number % 2;         //remainder=kalan // % kalan mod operatörü
		//System.out.println(remainder);
		boolean isPrime=true;    //isPrime=Asal sayý mý
		
		if (number==1) {
			System.out.println("sayý asal deðildir");
			return;  //üsttekini yazdýrýp artýk gerisini çalýþtýrmýyor.aksi halde sayý asal deðildir sayý asaldýr yazacaktý.
		}
		
		if (number<1) {
			System.out.println("Geçersiz sayý");
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime=false;
			}
		}
		
		if (isPrime) {    //isPrime==true ile ayný þey
			System.out.println("sayý asaldýr");
		}else {
			System.out.println("sayý asal deðildir.");
		}
	}
}
