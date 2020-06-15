package es.a.betta.portal.webapp;

import org.a.betta.portal.service.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import es.a.betta.portal.webapp.config.SpringConfig;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { SpringConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
