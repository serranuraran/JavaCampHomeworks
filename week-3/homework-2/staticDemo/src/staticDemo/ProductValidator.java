package staticDemo;

public class ProductValidator { // bir �r�n� g�ncellerken, bir �r�n� kaydederken �r�n�n kurallara uygun olup olmad�g�n� bulmak i�in kullan�r�z
	
	static {
		System.out.println("Static Yap�c� blok �al��t�");
	}
//	static {
//		System.out.println("Static Yap�c� blok �al��t�");
//	}
//	static {
//		System.out.println("Static Yap�c� blok �al��t�");
//	}
	
	public ProductValidator(){   //yap�c� blok, new'leyince �al���r		
		System.out.println("Yap�c� blok �al��t�");
	}
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) { // isEmpty : de�er girilmedi, bo� anlma�na geliyor. burda demek istiyoruz ki : bizim �r�n�m�z�n veritaban�na kaydedilebilmesi i�in fiyat�n�n 0'dan b�y�k olmas� ve isminin de verilmi� olmas� laz�m.
			return true;   //bu 2 kural birden ge�erliyse true
		}else {
			return false;
		}
	}
	
	public void bisey() {    //bunu �a��rabilmek i�in productvalidator'u newlememiz laz�m
		
	}
	 
	//Inner class
	public static class BaskaBirClass {   
		public static void Sil() {
			
		}
	}
}