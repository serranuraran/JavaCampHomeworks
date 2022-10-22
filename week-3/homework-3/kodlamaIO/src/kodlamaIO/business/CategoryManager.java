package kodlamaIO.business;

import java.util.Iterator;
import java.util.List;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.abstracts.CategoryDao;
import kodlamaIO.entities.Category;

public class CategoryManager {
	
	private List<Category> categories;
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	

	public CategoryManager(List<Category> categories, CategoryDao categoryDao, Logger[] loggers) {

		this.categories = categories;
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}


	public void add(Category category) throws Exception {
		for (Category c : categories) {
			if(c.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Kategori ismi tekrar edemez");
		}
	}
		categoryDao.add(category);
		categories.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	  }
		
	}
	
