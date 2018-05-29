import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	private String name;
	private String location;
	private ArrayList bookList;
	private ArrayList customerList;
	public Library(String name, String location, ArrayList bookList, ArrayList customerList) {
		super();
		this.name = name;
		this.location = location;
		this.bookList = bookList;
		this.customerList = customerList;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public ArrayList getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList bookList) {
		this.bookList = bookList;
	}
	public ArrayList getCustomerList() {
		return customerList;
	}
	public void setCustomerList(ArrayList customerList) {
		this.customerList = customerList;
	}
	
	@Override
	public String toString() {
		return "Library [name=" + name + ", location=" + location + ", bookList=" + bookList + ", customerList="
				+ customerList + "]";
	}

}
