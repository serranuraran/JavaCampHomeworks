package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		//bug
		int number=2;
		int remainder = number % 2;         //remainder=kalan // % kalan mod operat�r�
		//System.out.println(remainder);
		boolean isPrime=true;    //isPrime=Asal say� m�
		
		if (number==1) {
			System.out.println("say� asal de�ildir");
			return;  //�sttekini yazd�r�p art�k gerisini �al��t�rm�yor.aksi halde say� asal de�ildir say� asald�r yazacakt�.
		}
		
		if (number<1) {
			System.out.println("Ge�ersiz say�");
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime=false;
			}
		}
		
		if (isPrime) {    //isPrime==true ile ayn� �ey
			System.out.println("say� asald�r");
		}else {
			System.out.println("say� asal de�ildir.");
		}
	}
}
