package abstractDemo;

public class CustomerManager {
	BaseDatabaseManager databaseManager;

	public void getCustomers() {   //müşterileri getir diye operasyon yazıyorum
		databaseManager.getData();
	}
}