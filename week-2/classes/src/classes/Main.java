package classes;

public class Main {

	public static void main(String[] args) {
		
        //class�n ismi 
		CustomerManager customerManager = new CustomerManager();  //bir class�n �a�r�m� bu �ekildedir, bunu dedi�imizde bellekte o an customermanager t�r�nde bir nesne �retmi� oluyoruz 
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// Value types (int, double, float, boolean, char)
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);

		// Reference types (arrays, classes)
		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 10, 20, 30 };
		sayilar2 = sayilar1;
		sayilar1[0] = 1000;
		System.out.println(sayilar2[0]);
	}
	
}
