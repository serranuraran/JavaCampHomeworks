package kodlamaIO.dataAccess.concretes;

import kodlamaIO.dataAccess.abstracts.CategoryDao;
import kodlamaIO.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritabanýna eklendi");
		
	}
	
}
