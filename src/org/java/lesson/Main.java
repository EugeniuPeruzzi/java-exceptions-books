package org.java.lesson;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		
		//Book quantity
		System.out.print("Quanti libri vuoi inserire? ");
		String quantityBooksString = in.nextLine();
		int quantityBooks = Integer.valueOf(quantityBooksString);
		int i = 0;
		
		Book[] books = new Book[quantityBooks];
		
		while(i < quantityBooks) {
			
			//Book title
			System.out.println("Inserisci il titolo del libro " + (i+1));
			String title = in.nextLine();
			// Page quantity
			System.out.println("Quante pagine ha? ");
			String pagesString = in.nextLine();
			int pages = Integer.valueOf(pagesString);
			// Book Author
			System.out.println("Chi e l'autore? ");
			String author = in.nextLine();
			//Book editor
			System.out.println("Chi e l'editore? ");
			String editor = in.nextLine();
			
			try {
				books[i] = new Book(title, pages, author, editor);
				i++;
			}
		
		catch (Exception e){
			System.err.println(e.getMessage());
		}

		}
		for(int j=0; j<quantityBooks; j++) {
			Book book = books[j];
			System.out.println(book);
			in.close();
		}
	}

}
