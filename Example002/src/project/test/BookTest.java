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
	
	//Custom Asserts
	public static void assertEqual(Book expected, Book actual) {
		assertTrue(expected.getTitle().equals(actual.getTitle()) && expected.getAuthor().equals(actual.getAuthor()));
		
	}

}
