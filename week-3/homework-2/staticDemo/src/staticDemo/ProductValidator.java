package staticDemo;

public class ProductValidator { // bir ürünü güncellerken, bir ürünü kaydederken ürünün kurallara uygun olup olmadýgýný bulmak için kullanýrýz
	
	static {
		System.out.println("Static Yapýcý blok çalýþtý");
	}
//	static {
//		System.out.println("Static Yapýcý blok çalýþtý");
//	}
//	static {
//		System.out.println("Static Yapýcý blok çalýþtý");
//	}
	
	public ProductValidator(){   //yapýcý blok, new'leyince çalýþýr		
		System.out.println("Yapýcý blok çalýþtý");
	}
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) { // isEmpty : deðer girilmedi, boþ anlmaýna geliyor. burda demek istiyoruz ki : bizim ürünümüzün veritabanýna kaydedilebilmesi için fiyatýnýn 0'dan büyük olmasý ve isminin de verilmiþ olmasý lazým.
			return true;   //bu 2 kural birden geçerliyse true
		}else {
			return false;
		}
	}
	
	public void bisey() {    //bunu çaðýrabilmek için productvalidator'u newlememiz lazým
		
	}
	 
	//Inner class
	public static class BaskaBirClass {   
		public static void Sil() {
			
		}
	}
}