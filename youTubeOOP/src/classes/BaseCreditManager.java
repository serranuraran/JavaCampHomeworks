package classes;

abstract class BaseCreditManager implements CreditService {
	
    public abstract void calculate();       //calculate ortak degil her yerde degiþken o yüzden abstract olarak býrakýyorum, sadece imza
    
    public void save() {          //save ortak oldugu icin bu þekilde yazdýk
        System.out.println("Kaydedildi");
    }
}
