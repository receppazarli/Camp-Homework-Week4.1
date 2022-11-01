package kodlama.io.devs.dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAcces.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;
	
	
	
	
	public InMemoryLanguageRepository() {
			
		languages = new ArrayList<Language>();
		
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));
		languages.add(new Language(4, "Php"));
	
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public Language getId(int id) {
		
		return languages.get(id);
	}

	@Override
	public void add(Language entity) {
		
		languages.add(entity);
	}

	@Override
	public void update(int id,Language entity) {
		
		for (Language language : languages) {
			if (language.getId()==entity.getId()) {
				language.setName(entity.getName());
			}
		}
	}

	@Override
	public void remove(int id) {
		
		languages.remove(id);
		
	}

}
