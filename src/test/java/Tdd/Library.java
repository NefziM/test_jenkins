package Tdd;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
	 public Library() {
	        books = new ArrayList<>();
	    }

	
		


	 public Book searchBookByTitle(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equals(title)) {
	            
	                System.out.println("Livre trouvé: " + book.getTitle());
	                return book;  
	            } else {
	                System.out.println("Livre non trouvé pour le titre: " + title);
	            }
	        }
	        
	           return null;  
	    }

	public void addBook(Book book) {
		books.add(book);
		
	}
		
	}


