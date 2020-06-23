package org.a.betta.portal.service.models.documents.summary;

public class SummaryImage extends Summary {

	private String image;
	private String caption;

	public SummaryImage(String image, String caption) {
		this.image = image;
		this.caption = caption;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	@Override
	public String toString() {
		return "SummaryImage [image=" + image + ", caption=" + caption + "]";
	}

}
