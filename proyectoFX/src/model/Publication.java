package model;

import java.util.Date;

public class Publication {
	private String title;
	private String editorial;
	private String author;
	private String publicationDate;
	public Publication(String title, String editorial, String author, String publicationDate) {
		super();
		this.title = title;
		this.editorial = editorial;
		this.author = author;
		this.publicationDate = publicationDate;
	}
	public String getTitle() {
		return title;
	}
	public String getEditorial() {
		return editorial;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	
	
}
