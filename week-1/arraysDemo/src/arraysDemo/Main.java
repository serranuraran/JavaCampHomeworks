package arraysDemo;

public class Main {

	public static void main(String[] args) {
		     String[] students = new String[3];  //string ile cal�st�g�m icin string[]   //3 elemanl� bir dizi   //bir diziyi bu �ekilde tan�mlar�z
	         students[0] = "Serra";
	         students[1] = "Berat";
	         students[2] = "Bekir";
	         //students[3] = "Ahmet";    //hata al�r�z  new String[4]; olmal�yd�

	         for(int i = 0; i < students.length; i++){   //ogrencilerin eleman say�s�ndan k�c�k olacak
	             System.out.println(students[i]);
	         }

	         System.out.println("diger bir secenek"); 
	         for(String student : students){       //ogrenciler dizisindeki herbir eleman� gez   //herbir eleman� gezerken o anki elemana takma isim ver: ogrenci
	                System.out.println(student);
	         }
	    }
	}
