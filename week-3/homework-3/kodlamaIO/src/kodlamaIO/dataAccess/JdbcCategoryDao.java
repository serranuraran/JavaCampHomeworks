package kodlamaIO.dataAccess;

import kodlamaIO.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritabanýna eklendi");
		
	}
	
}
