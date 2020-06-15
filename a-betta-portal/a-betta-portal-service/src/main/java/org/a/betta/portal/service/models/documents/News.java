package org.a.betta.portal.service.models.documents;

import java.util.Calendar;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="News")
public class News {
	
	@Id
	private String id;
	private String name;
	private String title;
	private String subtitle;
	private String description;
	private Date date;
	private String image;
	
	public News(String name, String title, String subtitle) {
		this.name = name;
		this.title = title;
		this.subtitle = subtitle;
	}
	
//	public News(String name, String title, String subtitle, Date date) {
//		this.name = name;
//		this.title = title;
//		this.subtitle = subtitle;
//		this.date = date;
//	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setDate(int y, int m, int d) {
		Calendar auxDate = Calendar.getInstance();
		auxDate.set(y, m, d);
		this.date = auxDate.getTime();
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
