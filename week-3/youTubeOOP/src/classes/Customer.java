package classes;

public class Customer {

	public int id;
	public String city;

	public Customer() {     //new blogunu g�rd��� anda , heapte nesne olu�tugu zaman bir kere �al��acak bloktur. yani her nesneyi new'ledi�inizde bu blok �al���r
		System.out.println("M��teri nesnesi ba�lat�ld�");
	}
}