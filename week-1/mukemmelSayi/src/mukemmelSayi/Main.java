package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// 6 --> 1,2,3'e b�l�n�r
		// 28--> 1,2,4,7,14
		
		int number = 6;
		int sum = 0;
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}

		if (sum == number) {
			System.out.println("M�kemmel Say�");
		} else {
			System.out.println("M�kemmel Say� De�il");
		}
	}
}
