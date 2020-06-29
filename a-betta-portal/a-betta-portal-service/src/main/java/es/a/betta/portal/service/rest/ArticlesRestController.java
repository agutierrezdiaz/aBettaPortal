package es.a.betta.portal.service.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.a.betta.portal.service.models.documents.Articles;
import es.a.betta.portal.service.repositories.ArticlesRepository;

@RestController
@RequestMapping("/api/articles")
public class ArticlesRestController {

	@Autowired
	private ArticlesRepository articlesRepository;

	private static final Logger logger = LoggerFactory.getLogger(ArticlesRestController.class);
	
	@GetMapping("/get")
	@ResponseStatus(HttpStatus.OK)
	public List<Articles> getAll() {
		return this.articlesRepository.findAll();
	}
	
	@GetMapping("/get/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Articles get(@PathVariable String id) {
		return this.articlesRepository.findById(id).get();
	}
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Articles create(@RequestBody Articles article) {
		return this.articlesRepository.save(article);
	}
	
	@PutMapping("/update/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Articles update(@PathVariable String id, @RequestBody Articles article) {
		article.setId(id);
		return this.articlesRepository.save(article);
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		if (this.articlesRepository.findById(id).isPresent()) {
			this.articlesRepository.deleteById(id);
		}
	}
	
}
