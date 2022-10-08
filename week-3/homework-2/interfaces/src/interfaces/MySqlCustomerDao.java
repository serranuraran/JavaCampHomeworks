package interfaces;

public class MySqlCustomerDao implements CustomerDao, IRepository{

	@Override
	public void add() {
		System.out.println("My Sql eklendi");
		
	}

}
