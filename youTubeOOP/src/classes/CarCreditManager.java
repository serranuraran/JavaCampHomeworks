package classes;

public class CarCreditManager extends BaseCreditManager implements CreditService {
	@Override
	public void calculate() {
		System.out.println("Araba kredisi hesaplandý");
	}

}
