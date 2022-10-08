package abstractClasses;

//hesaplayý kullanýcak class lar kendi hesapla fonksiyonunu yazmalý.herkes için hesapla farklý.
public abstract class GameCalculator {       //kim implemente ediyorsa, yani kim inherit ediyorsa hesapla'yý içermek zorunda. fakat hesapla'yý override etmek zorunda
	public abstract void hesapla();    

	// gamecalculator kullanan class lar gameover kullanmak zorunda.
	public final void gameOver() {          //gamecalculator'u kim kullanýyorsa gameover'ý oldugu gibi kullanmak zorunda. bu hiçbir zaman deðiþmeyecek kuraldýr
		System.out.println("Oyun bitti");
	}
}