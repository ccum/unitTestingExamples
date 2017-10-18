package project.test;

import junit.framework.TestCase;
import project.model.Book;
import project.model.Library;

public class LibraryTest extends TestCase {
	
	private Library library;
	private Book book1,book2;
	
	public void setUp() {
		library = new Library();
		book1 = new Book("Dune", "Frank Herbert");
		book2 = new Book("Solaris", "Stanislaw Lem");
		library.addBook(book1);
		library.addBook(book2);
	}
	
	public void testGetBooks() {
		Book book= library.getBook("Dune");
		BookTest.assertEqual(book1, book);
		book = library.getBook("Solaris");
		BookTest.assertEqual(book2, book);

		
	}
	public void testLibrarySize() {
		assertTrue(library.getNumBooks()==2);
	}
	
	public void testRemoveBook()
	{
		library.removeBook("Dune");
		Book book = library.getBook("Dune");
		assertTrue("Book in not removed",book==null);
	}

}
