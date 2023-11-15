package org.java.lesson;

public class Book {
	private String title;
	private int pages;
	private String author;
	private String editor;
	
	// inserisco il throws Exception per dire che questa classe ha delle eccezzioni
	
	public Book(String title, int pages, String author, String editor) throws Exception{
		setTitle(title);
		setPages(pages);
		setAuthor(author);
		setEditor(editor);
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title)throws Exception{
	    if (title == null || title.isEmpty()) {
	        throw new Exception("Errore scrittura: il titolo è vuoto.");
	    }
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) throws Exception {
	    if (pages <= 0) {
	        throw new Exception("Errore scrittura: il titolo è vuoto.");
	    }
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws Exception {
	    if (author == null || author.isEmpty()) {
	        throw new Exception("Errore scrittura: il titolo è vuoto.");
	    }
		this.author = author;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) throws Exception {
	    if (editor == null || author.isEmpty()) {
	        throw new Exception("Errore scrittura: il titolo è vuoto.");
	    }
		this.editor = editor;
	}
	

	@Override
	public String toString() {
		
		return "_____________________ \n"
				+ "Titolo: " + getTitle() + "\n"
				+ "Pagine: " + getPages() + "\n"
				+ "Autore: " + getAuthor() + "\n"
				+ "Editor: " + getEditor() + "\n";
				
	}
}
