package abstractDemo;

public class CustomerManager {
	BaseDatabaseManager databaseManager;

	public void getCustomers() {   //m��terileri getir diye operasyon yaz�yorum
		databaseManager.getData();
	}
}