package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator =new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        /*Abstractlar base i gizlemek için de kullanýlýr.
        Abstract varsa new kullanmak için override yapmak zorunda kalýrýz. Normal kullanamayýz. çirkin bir kullanýmdýr
        GameCalculator gameCalculator=new GameCalculator() {
            @Override
            public void hesapla() {
            }
        };
        */
    }
}