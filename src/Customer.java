import java.util.ArrayList;

public class Customer {
	private String name;
	private String address;
	private int grade;
	private ArrayList<Books> assignedBooks;
	
	public Customer(String name, String address, int grade, ArrayList<Books> assignedBooks) {
		super();
		this.name = name;
		this.address = address;
		this.grade = grade;
		this.assignedBooks = assignedBooks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public ArrayList getAssignedBooks() {
		return assignedBooks;
	}
	public void setAssignedBooks(ArrayList assignedBooks) {
		this.assignedBooks = assignedBooks;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", grade=" + grade + ", assignedBooks="
				+ assignedBooks + "]";
	}
}
