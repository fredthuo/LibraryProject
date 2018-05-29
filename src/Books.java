import java.util.ArrayList;

public class Books {
	private String title;
	private String author;
	private long isbn;
	private int numberOfPages;
	private String nameOfLibraryBookIsAssociatedWith;
	public Books(String title, String author, long isbn, int numberOfPages, String nameOfLibraryBookIsAssociatedWith) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.numberOfPages = numberOfPages;
		this.nameOfLibraryBookIsAssociatedWith = nameOfLibraryBookIsAssociatedWith;
	}
	public String getNameOfLibraryBookIsAssociatedWith() {
		return nameOfLibraryBookIsAssociatedWith;
	}
	public void setNameOfLibraryBookIsAssociatedWith(String nameOfLibraryBookIsAssociatedWith) {
		this.nameOfLibraryBookIsAssociatedWith = nameOfLibraryBookIsAssociatedWith;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	@Override
	public String toString() {
		return "Books [title=" + title + ", author=" + author + ", isbn=" + isbn + ", numberOfPages=" + numberOfPages
				+ ", nameOfLibraryBookIsAssociatedWith=" + nameOfLibraryBookIsAssociatedWith + "]"+"\n";
	}
	public ArrayList<Books> get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
