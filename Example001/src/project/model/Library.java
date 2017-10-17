package project.model;

public class Library {
	
	private Book book;
	//Ctrl+Space 
	public Library() {
		// TODO Auto-generated constructor stub
	}
	
	public void addBook(Book book) {
		this.book=book;
	}
	public Book getBook(String title) {
		return book;
	}

}
