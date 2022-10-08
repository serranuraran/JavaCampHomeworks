package abstractClasses;

//hesaplay� kullan�cak class lar kendi hesapla fonksiyonunu yazmal�.herkes i�in hesapla farkl�.
public abstract class GameCalculator {       //kim implemente ediyorsa, yani kim inherit ediyorsa hesapla'y� i�ermek zorunda. fakat hesapla'y� override etmek zorunda
	public abstract void hesapla();    

	// gamecalculator kullanan class lar gameover kullanmak zorunda.
	public final void gameOver() {          //gamecalculator'u kim kullan�yorsa gameover'� oldugu gibi kullanmak zorunda. bu hi�bir zaman de�i�meyecek kurald�r
		System.out.println("Oyun bitti");
	}
}