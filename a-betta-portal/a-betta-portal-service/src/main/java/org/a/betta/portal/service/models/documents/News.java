package org.a.betta.portal.service.models.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="news")
public class News {
	
	@Id
	private String id;
	private String name;
	private String title;
	private String subtitle;
	private String description;
	private Date date;
	
	public News() {}
	
}
