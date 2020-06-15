package es.a.betta.portal.webapp.controller;

import java.util.List;
import java.util.Optional;

import org.a.betta.portal.service.models.documents.News;
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
	
	@GetMapping("/")
	public String initPortal(Model model) {
		logger.debug("a-Betta portal is running...");

		List<News> news = newsRepository.findAll(); 
		
		model.addAttribute("title", "aBetta Portal");
		model.addAttribute("news", news);
		return "home";
	}

	@GetMapping("/{id}")
	public String viewNews(@PathVariable String id, Model model) {
		String template = "redirect:/";
		
		if (null != id) {
			Optional<News> article = newsRepository.findById(id);
			if (article.isPresent()) {
				model.addAttribute("title", article.get().getTitle());
				model.addAttribute("article", article.get());
				template = "templates/newsDetail";
			}
		}
		
		return template;
	}
}
