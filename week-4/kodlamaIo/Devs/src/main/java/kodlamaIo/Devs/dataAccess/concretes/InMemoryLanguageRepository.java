package kodlamaIo.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlamaIo.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaIo.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{

	private List<Language> languages;
	
	
	public InMemoryLanguageRepository() {
		languages=new ArrayList<Language>();
		languages.add(new Language(1,"C#"));
		languages.add(new Language(1,"Java"));
		languages.add(new Language(1,"Python"));	
	}


	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}


	@Override
	public void add(Language language) {
		// TODO Auto-generated method stub
		 languages.add(language);
	}


	@Override
	public void delete(int id) throws Exception {
		Language deletedLanguage=getById(id);
		languages.remove(deletedLanguage);
		
	}


	@Override
	public Language getById(int id) throws Exception {
		for (Language language : languages) {
			if (language.getId() == id)
				return language;
		}
		return null;
	}


	@Override
	public void update(Language language, int id) throws Exception {
		Language changeLanguage = getById(id);
		changeLanguage.setName(language.getName());
		
	}

}
