package kodlamaIo.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaIo.Devs.business.abstracts.LanguageService;
import kodlamaIo.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaIo.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	private LanguageRepository languageRepository;

	public LanguageManager(LanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		
		return languageRepository.getAll();
	}

	@Override
	public Language getById(int id) throws Exception {
		if(!isIdExist(id)) {
			throw new Exception("İd bulunamadı.");
		}
		return languageRepository.getById(id);
	}

	@Override
	public void add(Language language) throws Exception {
		isValid(language);
		if (isIdExist(language.getId())) {
            throw new Exception("Id önceden kaydedilmiş");
        }
		languageRepository.add(language);
    }
	
	@Override
	public void update(Language language,int id) throws Exception {
		if(!isIdExist(id)) {
            throw new Exception("İd bulunamadı");
       }
		isValid(language);
		languageRepository.update(language, id);
    }		
	
	

	@Override
	public void delete(int id) throws Exception {
		if(!isIdExist(id)) {
			throw new Exception("İd bulunamadı.");
		}
		languageRepository.delete(id);
		
	}

	public boolean isIdExist(int id)throws Exception{
		for(Language lang : getAll()) {
			if(lang.getId()==id) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isValid(Language language)throws Exception{
		if(language.getName().isBlank()) {
			throw new Exception("Bu isim alanı boş geçilemez.");
		}
		for(Language language1 : getAll()) {
			if(language1.getName().equalsIgnoreCase(language.getName())) {
				throw new Exception("Bu isim kullanılmış.");
			}
		}
		return true;
	}
	
}

