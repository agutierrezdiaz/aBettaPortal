package es.a.betta.portal.service.models.documents.summary;

public class Summary {

	private String text;
	
	public Summary() {
		super();
	}

	public Summary(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Summary [text=" + text + "]";
	}
	
	public String getClassType() {
		return this.getClass().getSimpleName();
	}
	
}
