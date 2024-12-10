package Tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class TestSearch {
	 @Test
	    public void testSearchBookByTitle() {
		 
		 Library library = new Library();
		 library.addBook(new Book("Java Basics", "Author1"));
	     library.addBook(new Book("Advanced Java", "Author2"));
	        
		 Book result=library.searchBookByTitle("Java Basics");
		 assertNotNull(result);  
	        assertEquals("Java Basics", result.getTitle());  
	        
	 }

}
