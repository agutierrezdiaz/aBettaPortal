package org.a.betta.portal.service.models.documents;

import java.util.Collection;
import java.util.Date;

import org.a.betta.portal.service.models.documents.summary.Summary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "articles")
public class Articles {

	@Id
	private String id;
	private String name;
	private String title;
	private String subtitle;
	private Date date;
	private String image;
	private Collection<String> categories;
	private String author;
	private Collection<Summary> summary;

	public Articles() {
	}

	public Articles(String name, String title, String subtitle, Date date, String image,
			Collection<String> categories, String author, Collection<Summary> summary) {
		super();
		this.name = name;
		this.title = title;
		this.subtitle = subtitle;
		this.date = date;
		this.image = image;
		this.categories = categories;
		this.author = author;
		this.summary = summary;
	}

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Collection<String> getCategories() {
		return categories;
	}

	public void setCategories(Collection<String> categories) {
		this.categories = categories;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Collection<Summary> getSummary() {
		return summary;
	}

	public void setSummary(Collection<Summary> summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "Articles [id=" + id + ", name=" + name + ", title=" + title + ", subtitle=" + subtitle + ", date="
				+ date + ", image=" + image + ", categories=" + categories + ", author=" + author + ", summary="
				+ summary + "]";
	}

}
