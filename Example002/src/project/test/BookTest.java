package project.test;

import junit.framework.TestCase;
import project.model.Book;

public class BookTest extends TestCase {
	
	public void testConstructBook() {
		Book book = new Book("Dune","");
		assertTrue(book.getTitle().equals("Dune"));
	}
	public void testAuthor() {
		Book book = new Book("Dune", "Frank Herbert");
		assertTrue(book.getAuthor().equals("Frank Herbert"));
	}

}
