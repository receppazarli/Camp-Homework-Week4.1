package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Language;

public interface LanguageService {

	List<Language> getAll();

	Language getId(int id);
	
	void add(Language language) throws Exception;

	void update(int id,Language language);

	void remove(int id);

	
}
