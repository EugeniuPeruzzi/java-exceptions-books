package org.java.lesson;

public class Book {
	private String title;
	private int pages;
	private String author;
	private String editor;
	
	public Book(String title, int pages, String author, String editor) {
		getTitle();
		getPages();
		getAuthor();
		getEditor();
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}
}
