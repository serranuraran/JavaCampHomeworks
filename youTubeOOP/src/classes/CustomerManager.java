package classes;

public class CustomerManager {
	
	private Customer customer;   //CustomerManager'e biz customer bilgisini veriyoruz ki onu kendi içinde kaydetsin ve ona ulaþabilsin
	private CreditService creditService;

	public CustomerManager(Customer customer, CreditService creditService) {
		this.customer = customer;
		this.creditService = creditService;
	}

	public void save() {
		System.out.println("Müþteri kaydedildi");
	}

	public void delete() {
		System.out.println("Müþteri silindi");
	}

	public void giveCredit() {
		creditService.calculate();
		System.out.println("Müþteriye kredi verildi");
	}
}