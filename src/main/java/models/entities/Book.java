package models.entities;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private int id;
	private String isbn;
	private List<Author> authors;
	private List<Theme> themes;
	public Book(int id, String isbn) {
		this.id = id;
		this.isbn = isbn;
		authors = new ArrayList<>();
		themes = new ArrayList<>();
	}
}
