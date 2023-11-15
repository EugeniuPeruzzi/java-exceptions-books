package org.java.lesson;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		
		//Book quantity
		System.out.print("Quanti libri vuoi inserire? ");
		String quantityBooksString = in.nextLine();
		int quantityBooks = Integer.valueOf(quantityBooksString);
		//Book title
		System.out.print("Inserisci il titolo del libro ");
		String title = in.nextLine();
		// Page quantity
		System.out.print("Quante pagine ha? ");
		String pagesString = in.nextLine();
		int pages = Integer.valueOf(pagesString);
		// Book Author
		System.out.print("Chi e l'autore? ");
		String author = in.nextLine();
		//Book editor
		System.out.print("Chi e l'editore? ");
		String editor = in.nextLine();
		
		//String[] gg = new String[quantityBooks];
		
		Book b1 = new Book(title,pages, author, editor );
		
		System.out.println(b1);
		

		in.close();
	}


}
