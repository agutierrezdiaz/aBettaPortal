package es.a.betta.portal.webapp.view;

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import es.a.betta.portal.service.models.documents.Articles;

@Component
public class ArticlesListJsonView extends MappingJackson2JsonView {

	@Override
	protected Object filterModel(Map<String, Object> model) {

		model.remove("titulo");
		model.remove("page");

		Page<Articles> articles = (Page<Articles>) model.get("articles");
		model.remove("articles");
		
		model.put("articles", articles.getContent());
		
		return super.filterModel(model);
	}
	
}
