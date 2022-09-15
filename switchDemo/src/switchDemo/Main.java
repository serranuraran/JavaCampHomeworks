package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'B';
		switch (grade) // switch bloðunun içerisine þartýmýzýn öznesini yazýyoruz
		{
		case 'A':
			System.out.println("Mükemmel : Geçtiniz!");
			break;
		case 'B':   //B ve C için ayný çýktýyý vermek istiyorsanýz bu þekilde yazabilirsiniz
		case 'C':
			System.out.println("Ýyi : Geçtiniz.");
			break;
		case 'D':
			System.out.println("Fena Deðil : Geçtiniz");
		case 'F':
			System.out.println("Maalesef : Kaldýnýz.");
			break;
		default: // kullanýcý üstteki notlarýn dýþýnda bir not girerse
			System.out.println("Geçersiz not girdiniz.");
		}
	}
}