package valueAndReferenceType;

public class Main {

	public static void main(String[] args) {
		    int sayi1 = 10;
	        int sayi2 = 20;
	        
	        sayi1 = sayi2;
	        sayi2 = 100;
	        
	        System.out.println(sayi1);    // Result: 20 
	        System.out.println("******");
	        
	        int[] sayilar1 = new int[]{1, 2, 3};
	        int[] sayilar2 = new int[]{4, 5, 6};
	        
	        sayilar2 = sayilar2;
	        sayilar2[0] = 1000;
	        
	        System.out.println(sayilar2[0]);    // Result: 1000
	    }
	}