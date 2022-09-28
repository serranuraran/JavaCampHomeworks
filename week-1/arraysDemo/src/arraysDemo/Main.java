package arraysDemo;

public class Main {

	public static void main(String[] args) {
		     String[] students = new String[3];  //string ile calýstýgým icin string[]   //3 elemanlý bir dizi   //bir diziyi bu þekilde tanýmlarýz
	         students[0] = "Serra";
	         students[1] = "Berat";
	         students[2] = "Bekir";
	         //students[3] = "Ahmet";    //hata alýrýz  new String[4]; olmalýydý

	         for(int i = 0; i < students.length; i++){   //ogrencilerin eleman sayýsýndan kücük olacak
	             System.out.println(students[i]);
	         }

	         System.out.println("diger bir secenek"); 
	         for(String student : students){       //ogrenciler dizisindeki herbir elemaný gez   //herbir elemaný gezerken o anki elemana takma isim ver: ogrenci
	                System.out.println(student);
	         }
	    }
	}
