package interfaces;

public class Main {

	public static void main(String[] args) {
		// Interface'ler de abstract'lar gibi new'lenemezler
		//CustomerDao customerDao = new CustomerDao();   bu uygun deðil 
        // CustomerDao customerDao = new OracleCustomerDao();   ama bu uygun
		//yani interface, onu implemente eden classýn referansýný tutabilir

		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDao());
       // customerManager.customerDao = new MySqlCustomerDao();
		customerManager.add();
	}
}