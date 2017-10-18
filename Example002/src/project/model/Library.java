package project.model;

import java.util.Vector;

public class Library {
	
	
	private Vector books;
	
	//Ctrl+Space 
	public Library() {
		books= new Vector();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	public Book getBook(String title) {
		for(int i=0;i<books.size();i++) {
			Book book= (Book)books.elementAt(i);
			if(book.getTitle().equals(title))
				return book;
		}
		return null;
	}

	public int getNumBooks() {
		return books.size();
	}

	public void removeBook(String title) {
		for(int i=0;i<books.size();i++) {
			Book book= (Book)books.elementAt(i);
			if(book.getTitle().equals(title)) {
				books.remove(i);
				break;
			}
				
		}
		
	}


}
