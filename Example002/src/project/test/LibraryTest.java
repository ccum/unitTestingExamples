package project.test;

import junit.framework.TestCase;
import project.model.Book;
import project.model.Library;

public class LibraryTest extends TestCase {
	
	public void testAddBooks() {
		Library library = new Library();
		library.addBook(new Book("Dune", "Frank Herbert"));
		library.addBook(new Book("Solaris", "Stanislaw Lem"));
		
		Book book= library.getBook("Dune");
		assertTrue(book.getTitle().equals("Dune"));
		book = library.getBook("Solaris");
		assertTrue(book.getTitle().equals("Solaris"));

		
	}
	public void testLibrarySize() {
		Library library = new Library();
		library.addBook(new Book("Dune", "Frank Herbert"));
		library.addBook(new Book("Solaris", "Stanislaw Lem"));
		assertTrue(library.getNumBooks()==2);
	}

}
