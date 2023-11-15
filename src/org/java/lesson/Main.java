package org.java.lesson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	// create file
	static final File bookWriting = new File ("./book.txt");
    public static void main(String[] args) throws Exception {
    	//PrintWriter writer = new PrintWriter(new FileWriter("books.txt"));

        Scanner in = new Scanner(System.in);
        
        // Prompt user for the number of books to input
        System.out.print("Quanti libri vuoi inserire? ");
        String quantityBooksString = in.nextLine();
        int quantityBooks = Integer.valueOf(quantityBooksString);
        int i = 0;
        
        // Array to store book objects
        Book[] books = new Book[quantityBooks];
        
        // Loop to collect data for each book
        while(i < quantityBooks) {
            
            // Prompt for the title of the book
            System.out.println("Inserisci il titolo del libro " + (i+1));
            String title = in.nextLine();
            // Prompt for the number of pages
            System.out.println("Quante pagine ha? ");
            String pagesString = in.nextLine();
            int pages = Integer.valueOf(pagesString);
            // Prompt for the author of the book
            System.out.println("Chi e l'autore? ");
            String author = in.nextLine();
            // Prompt for the publisher of the book
            System.out.println("Chi e l'editore? ");
            String editor = in.nextLine();
            
            try {
                // Create a new Book object and add it to the array
                books[i] = new Book(title, pages, author, editor);
                i++;
            }
            // Catch and display any errors during book creation
            catch (Exception e){
                System.err.println(e.getMessage());
            }
        }

        // Loop to display information about each book
//        for(int j=0; j<quantityBooks; j++) {
//            Book book = books[j];
//            System.out.println(book);
//            //writer.println(book);
//            // Close the scanner
//        }
        //writer.close();
        in.close();
        
        
        //FILE WRITER
        FileWriter bookWriter = null;
		try {
			
			bookWriter = new FileWriter(bookWriting);
			
			for (int x=0;x<quantityBooks;x++) {
					
	            Book book = books[x];

				bookWriter.write("_____________________ \n"
						+ "Titolo: " + book.getTitle() + "\n"
						+ "Pagine: " + book.getPages() + "\n"
						+ "Autore: " + book.getAuthor() + "\n"
						+ "Editor: " + book.getEditor() + "\n");
			}
		} catch (IOException e) {
			
			System.out.println("Error writing file: " + e.getMessage());
		} finally {
			
			if (bookWriter != null)
				try {
					bookWriter.close();
				} catch (IOException e) { }
		}
		
		// FILE READ
		Scanner reader = null;
		try {
			
			reader = new Scanner(bookWriting);
			
			while (reader.hasNextLine()) {
			   String data = reader.nextLine();
			 
			   System.out.println(data);
			   //System.err.println("sto stampando dal file");
			}
		} catch (FileNotFoundException e) {
			
			System.out.println("Error reading file: " + e.getMessage());
		} finally {
			
			if (reader != null)
				reader.close();
		}
    }

}
