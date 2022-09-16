package recapDemo3;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2, 6.3, 4.3, 5.6};   //new yapýp yazmakla ayný sey
        double total = 0;
        double max = myList[0];    //myList'in 0. elemanýný enbuyuk sayý olarak verebilirim
        for (double number : myList) {       //myList içerisindeki sayýlarý gez
            if (max < number) {       //herbir elemaný max ile karþýlaþtýrýyorum
                max = number;
            }
            total += number;    //total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam =  " + total);
        System.out.println("En büyük =  " + max);
    }
}