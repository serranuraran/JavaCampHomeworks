package kodlamaIo.Devs.dataAccess.abstracts;

import java.util.List;

import kodlamaIo.Devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	
	void add(Language language);
	void delete(int id) throws Exception;
	
	
	void update(Language language,int id) throws Exception;
	Language getById(int id) throws Exception;
}
