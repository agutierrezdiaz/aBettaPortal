package es.a.betta.portal.webapp.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import es.a.betta.portal.service.models.documents.Articles;
import es.a.betta.portal.service.repositories.ArticlesRepository;

@Controller
public class InitController {

	private final Logger logger = LoggerFactory.getLogger(InitController.class);

	@Autowired
	private ArticlesRepository articlesRepository;
	
	@GetMapping("/")
	public String initPortal(Model model) {
		logger.debug("a-Betta portal is running...");

		List<Articles> articles = articlesRepository.findAll();
		articles.sort((Articles a1, Articles a2) -> a2.getDate().compareTo(a1.getDate()));
//		Collections.sort(articles, (Articles a1, Articles a2) -> a2.getDate().compareTo(a1.getDate())); 
		
		model.addAttribute("title", "aBetta Portal");
		model.addAttribute("articles", articles);
		return "home";
	}
	
	@GetMapping("/{id}")
	public String viewArticle(@PathVariable String id, Model model) {
		String template = "redirect:/";
		
		if (null != id) {
			Optional<Articles> article = this.articlesRepository.findById(id);
			
			if (article.isPresent()) {
				model.addAttribute("title", article.get().getTitle());
				model.addAttribute("article", article.get());
				template = "templates/articleDetail";
			}
		}
		
		return template;
	}
	
}
