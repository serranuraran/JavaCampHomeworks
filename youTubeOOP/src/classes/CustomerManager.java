package classes;

public class CustomerManager {
	
	private Customer customer;   //CustomerManager'e biz customer bilgisini veriyoruz ki onu kendi i�inde kaydetsin ve ona ula�abilsin
	private CreditService creditService;

	public CustomerManager(Customer customer, CreditService creditService) {
		this.customer = customer;
		this.creditService = creditService;
	}

	public void save() {
		System.out.println("M��teri kaydedildi");
	}

	public void delete() {
		System.out.println("M��teri silindi");
	}

	public void giveCredit() {
		creditService.calculate();
		System.out.println("M��teriye kredi verildi");
	}
}