package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesContreller {

	LanguageService languageService;

	@Autowired
	public LanguagesContreller(LanguageService languageService) {

		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<Language> getAll() {
		return languageService.getAll();
	}

	@GetMapping("/getid")
	public Language getId(int id) {
		return languageService.getId(id);
	}

	@PostMapping("/add")
	public void add(Language language) throws Exception {
		languageService.add(language);
	}

	@PutMapping("/update")
	public void update(int id, Language language) {
		languageService.update(id, language);
	}

	@DeleteMapping("/remove")
	public void remove(int id) {
		languageService.remove(id);
	}

}
