package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator =new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        /*Abstractlar base i gizlemek i�in de kullan�l�r.
        Abstract varsa new kullanmak i�in override yapmak zorunda kal�r�z. Normal kullanamay�z. �irkin bir kullan�md�r
        GameCalculator gameCalculator=new GameCalculator() {
            @Override
            public void hesapla() {
            }
        };
        */
    }
}