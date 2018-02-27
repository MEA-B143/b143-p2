package P2;
import java.util.*;
public class Book {
	String title;
	String author;
	String genre;
	Date publication_date;
	String publisher;
	Date return_date;
	Date lending_date;
	boolean borrowed;
	int lendedUserID;
	String lendedUserName;
	
	Book(String genre, String title, String author, String publisher) {
		this.author = author;
		this.title = title;
		this.genre = genre;
		this.publisher = publisher;
		publication_date = new Date();
	}
	
	public void borrow(User user) {
		lendedUserID = user.id;
		lendedUserName = user.name;
		lending_date = new Date();
	}
}
