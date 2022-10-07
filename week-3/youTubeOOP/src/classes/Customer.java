package classes;

public class Customer {

	public int id;
	public String city;

	public Customer() {     //new blogunu gördüðü anda , heapte nesne oluþtugu zaman bir kere çalýþacak bloktur. yani her nesneyi new'lediðinizde bu blok çalýþýr
		System.out.println("Müþteri nesnesi baþlatýldý");
	}
}