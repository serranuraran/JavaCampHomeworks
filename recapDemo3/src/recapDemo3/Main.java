package recapDemo3;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2, 6.3, 4.3, 5.6};   //new yap�p yazmakla ayn� sey
        double total = 0;
        double max = myList[0];    //myList'in 0. eleman�n� enbuyuk say� olarak verebilirim
        for (double number : myList) {       //myList i�erisindeki say�lar� gez
            if (max < number) {       //herbir eleman� max ile kar��la�t�r�yorum
                max = number;
            }
            total += number;    //total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam =  " + total);
        System.out.println("En b�y�k =  " + max);
    }
}