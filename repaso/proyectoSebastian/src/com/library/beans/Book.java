package com.library.beans;

public class Book {

	// idAuthor, idEditorial, idGenre, idStatus,

	private int id;
	private String name;
	private String description;
	private String publishedDate;
	private int idAuthor;
	private int idEditorial;
	private int idGenre;
	private int idStatus;

	public Book(int id, String name, String description, String publishedDate, int idAuthor, int idEditorial,
			int idGenre, int idStatus) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.publishedDate = publishedDate;
		this.idAuthor = idAuthor;
		this.idEditorial = idEditorial;
		this.idGenre = idGenre;
		this.idStatus = idStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public int getIdAuthor() {
		return idAuthor;
	}

	public void setIdAuthor(int idAuthor) {
		this.idAuthor = idAuthor;
	}

	public int getIdEditorial() {
		return idEditorial;
	}

	public void setIdEditorial(int idEditorial) {
		this.idEditorial = idEditorial;
	}

	public int getIdGenre() {
		return idGenre;
	}

	public void setIdGenre(int idGenre) {
		this.idGenre = idGenre;
	}

	public int getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}

}
