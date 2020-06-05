package es.a.betta.webapp;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import es.a.betta.webapp.config.SpringConfig;

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
