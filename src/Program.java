import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		ArrayList<Books> florissantBookList = new ArrayList<Books>();
		ArrayList<Books> hazelwoodBookList = new ArrayList<Books>();
		ArrayList<Customer> florissantCustomerList = new ArrayList<Customer>();
		ArrayList<Customer> hazelwoodCustomerList = new ArrayList<Customer>();
		Library florissant = new Library("FLorissant Library", "FLorissant, Mo", florissantBookList, florissantCustomerList);
		Library hazelwood = new Library("Hazelwood Library", "Hazelwood, Mo", hazelwoodBookList, hazelwoodCustomerList);
		
		Books one = new Books("Things Fall Apart", "Chinua Achebe", 435905252, 148, "Florissant Library");
		Books two = new Books("Long Walk to Freedom", "Nelson Mandela", 316874965, 630, "Florisant Library");
		Books three  = new Books("Americanah", "Chimamanda Adichie", 978030745, 608, "Hazelwood Library");
		Books four = new Books("Purple Hibiscus", "Chimamanda Adichie", 978161620, 336, "Hazelwood Library");
		Books five = new Books("Hamlet", "Shakespheare", 788074265, 500, "FLorissant Library");
		Books six = new Books("Romeo and Juliet", "Shakespheare", 978074348, 336, "FLorissant Library");
		florissantBookList.add(one);
		florissantBookList.add(two);
		florissantBookList.add(five);
		hazelwoodBookList.add(three);
		hazelwoodBookList.add(four);
		hazelwoodBookList.add(six);
	
		ArrayList<Books> fredBooks = new ArrayList<Books>();
		ArrayList<Books> samBooks = new ArrayList<Books>();
		ArrayList<Books> josephineBooks = new ArrayList<Books>();
		ArrayList<Books> gladwellBooks = new ArrayList<Books>();
		
		
		Customer fred = new Customer("Fredrick Muikia", "1140 FLordawn Drive", 12, fredBooks);
		Customer sam = new Customer("Samuel Muikia", "1140 Flordawn Drive", 10, samBooks);
		Customer josephine = new Customer("Josephine Nyambura", "6554 Serenity Circle", 9, josephineBooks);
		Customer gladwell = new Customer("Gladwell Kanyi", "6554 Serenity Circle", 12, gladwellBooks);
		
		fredBooks.add(one);
		fredBooks.add(six);
		samBooks.add(two);
		josephineBooks.add(three);
		gladwellBooks.add(four);
		
		florissantCustomerList.add(fred);
		florissantCustomerList.add(sam);
		hazelwoodCustomerList.add(josephine);
		hazelwoodCustomerList.add(gladwell);
		
		if(fredBooks.add(one)) {
			florissantBookList.remove(one);
		}
		if(samBooks.add(two)) {
			florissantBookList.remove(two);
		}
		if(josephineBooks.add(three)) {
			hazelwoodBookList.remove(three);
		}
		if(gladwellBooks.add(four)) {
			hazelwoodBookList.remove(four);
		}
		
		System.out.println("Welcome to St. Louis County Library.\n"+"St. Louis County Library has two branches.\n" + "Florissant Library and Hazelwood Library.");
		System.out.println();
		System.out.println("Florissant Library:\nLocated in " + florissant.getLocation());
		System.out.println("Florissant Library has "+ florissantBookList.size()+" books available.\n" + "Operating hours:\nMonday - Friday (09:00 am - 05:00 pm) ");
		System.out.println();
		System.out.println("Hazelwood Library:\nLocated in " + florissant.getLocation());
		System.out.println("Hazelwood Library has "+ hazelwoodBookList.size()+" books available.\n" + "Operating hours:\nMonday - Friday (09:00 am - 05:00 pm) ");
		System.out.println();
		
		System.out.println("Things Fall Apart can be borrowed from " + one.getNameOfLibraryBookIsAssociatedWith());
		System.out.println("Hamlet can be borrowed from " + five.getNameOfLibraryBookIsAssociatedWith());
		System.out.println("Americanah can be borrowed from " + three.getNameOfLibraryBookIsAssociatedWith());
		System.out.println();
		
		Customer newCustomer = new Customer(null, null, 0, null);
		Scanner input = new Scanner(System.in);
		System.out.println("What library would you like to sign up with:\nFor Florissant Library Enter: 1 \nFor Hazelwood Library Enter: 2");
		if(input.nextInt() == 1) {
			florissantCustomerList.add(newCustomer);
		}
		else {
			hazelwoodCustomerList.add(newCustomer);
		}
		System.out.println();
		Scanner stwo = new Scanner(System.in);
		System.out.println("Welcome to St. Louis Library.\nEnter your First and Last Name:");
		newCustomer.setName(stwo.nextLine());
		System.out.println("Billing address: ");
		newCustomer.setAddress(stwo.nextLine());
		System.out.println("Grade level: ");
		newCustomer.setGrade(stwo.nextInt());
		System.out.println();
		
		System.out.println("Hello " + newCustomer.getName() + "!!!\n" + "Welcome to St. Louis County Library");
		System.out.println("You are welcome to check out books from\nour facilitie anytime from 09:00 am to 05:00 pm");
		System.out.println();
		
		System.out.println("Fred booklist include ");
		for(int i = 0; i<fredBooks.size();i++) {
			System.out.println(fredBooks.get(i).getTitle());
		}
		

		
		
		
		

	
	
	}
	

}
