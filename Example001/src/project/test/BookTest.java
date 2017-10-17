package project.test;

import project.model.Book;

public class BookTest extends UnitTest {

	@Override
	public void runTest() throws Exception {
		// TODO Auto-generated method stub
		Book book = new Book("Dune");
		assertTrue(book.title.equals("Dune"), "Checking title");
		
	}

}
