package project.test;

import project.model.Book;
import project.model.Library;

public class LibraryTest extends UnitTest {

	@Override
	public void runTest() throws Exception {
		
		Library library = new Library();
		Book expectedBook= new Book("Dune");
		library.addBook(expectedBook);
		Book actualBook = library.getBook("Dune");
		assertTrue(actualBook.title.equals("Dune"), "got book");
		
		
	}

}
