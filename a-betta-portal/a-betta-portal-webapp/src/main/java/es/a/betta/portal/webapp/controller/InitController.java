package es.a.betta.portal.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InitController {

	private final Logger logger = LoggerFactory.getLogger(InitController.class);
	
	@GetMapping("/")
	public String initPortal() {
		logger.debug("a-Betta portal is running...");
		return "index";
	}
	
}
