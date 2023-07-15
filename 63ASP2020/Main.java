abstract class LibraryItem{
	private String title;
	private String itemID;
	private boolean checkedOut;

	public LibraryItem(String title, String itemID){
		this.title = title;
		this.itemID = itemID;
		this.checkedOut = false;
	}

	public void checkOut(){
		this.checkedOut = true;
	}

	public void checkIn(){
		this.checkedOut = false;
	}

	public void displayItemDetails(){
		System.out.println("Title:" + this.title);
		System.out.println("Item ID:" + this.itemID);
		System.out.println("Checked Out:" + this.checkedOut);
	}
}

class Book extends LibraryItem{
	private String author;
	private int numPages;

	public Book(String title,String itemID,String author,int numPages){
		super(title,itemID);
		this.author = author;
		this.numPages = numPages;
	}

	public void displayItemDetails(){
		super.displayItemDetails();
		System.out.println("Author:" + this.author);
		System.out.println("Number of pages:" + this.numPages);

	}
}

class Magazine extends LibraryItem{

	private String issueDate;
	private String publisher;

	public Magazine(String title,String itemID, String issueDate,String publisher){
		super(title,itemID);
		this.issueDate = issueDate;
		this.publisher = publisher;
	}

	public void displayItemDetails(){
		super.displayItemDetails();
		System.out.println("Issue Date:" + this.issueDate);
		System.out.println("Publisher:" + this.publisher);
	}
}

class LibraryMember{
	private String memberID;
	private String name;

	public LibraryMember(String memberID,String name){
		this.memberID = memberID;
		this.name = name;
	}

	public void displayMemberDetails(){
		System.out.println("Member ID:" + this.memberID);
		System.out.println("Name:" + this.name);
	}
}

public class Main{
	public static void main(String[] args){
		Book[]books = new Book[5];
		books[0] = new Book("The Catcher in the Rye","B001","J.D.Salinger",240);
		books[1] = new Book("To Kill a Mokingbird","B002","Harper Lee",281);
		books[2] = new Book("19840","B003","George Orwell",328);
		books[3] = new Book("Pride and Prejudice","B004","Jane Austen",432);
		books[4] = new Book("The Hobbit","B005","J.R.R.Tolkien",320);

		Magazine[]magazines = new Magazine[5];
		magazines[0] = new Magazine("National Geographic", "M001","August 2023","National Geographic Society");
		magazines[1] = new Magazine("Time","M002","September 2023","Time USA,LIC");
		magazines[2] = new Magazine("Forbes","M003","June 2023","Forbes Media");
		magazines[3] = new Magazine("Vogue","M004","July 2023","Conde Nast");
		magazines[4] = new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");

		LibraryMember[] members = new LibraryMember[5];
		members[0] = new LibraryMember("L001","John Doe");
		members[1] = new LibraryMember("L002","Jane Smith");
		members[2] = new LibraryMember("L003","David Johnson");
		members[3] = new LibraryMember("L004","Sarah Williams");
		members[4] = new LibraryMember("L005","Michael Brown");

		books[0].checkOut();
		books[0].checkIn();

		for(Book book : books){
			book.displayItemDetails();
			System.out.println();
		}

		for(Magazine magazine : magazines){
			magazine.displayItemDetails();
			System.out.println();
		}

		for(LibraryMember member : members){
			member.displayMemberDetails();
			System.out.println();
		}
	}
}

