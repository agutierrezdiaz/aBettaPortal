package es.a.betta.portal.webapp.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.a.betta.portal.service.models.documents.Articles;
import org.a.betta.portal.service.models.documents.News;
import org.a.betta.portal.service.repositories.ArticlesRepository;
import org.a.betta.portal.service.repositories.NewsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class InitController {

	private final Logger logger = LoggerFactory.getLogger(InitController.class);

	@Autowired
	private NewsRepository newsRepository;
	
	@Autowired
	private ArticlesRepository articlesRepository;
	
	@GetMapping("/")
	public String initPortal(Model model) {
		logger.debug("a-Betta portal is running...");

		List<News> news = newsRepository.findAll();
		Collections.sort(news, (News n1, News n2) -> n2.getDate().compareTo(n1.getDate())); 
		
		model.addAttribute("title", "aBetta Portal");
		model.addAttribute("news", news);
		return "home";
	}
	
	@GetMapping("/{id}")
	public String viewNews(@PathVariable String id, Model model) {
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
