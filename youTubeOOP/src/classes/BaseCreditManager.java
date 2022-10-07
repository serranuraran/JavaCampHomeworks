package classes;

abstract class BaseCreditManager implements CreditService {
	
    public abstract void calculate();       //calculate ortak degil her yerde degi�ken o y�zden abstract olarak b�rak�yorum, sadece imza
    
    public void save() {          //save ortak oldugu icin bu �ekilde yazd�k
        System.out.println("Kaydedildi");
    }
}
