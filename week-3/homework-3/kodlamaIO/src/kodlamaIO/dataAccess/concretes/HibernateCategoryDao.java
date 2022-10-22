package kodlamaIO.dataAccess.concretes;

import kodlamaIO.dataAccess.abstracts.CategoryDao;
import kodlamaIO.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanýna eklendi");
		
	}

}
