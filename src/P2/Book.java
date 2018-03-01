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
	int returnedUserID;
	String lendedUserName;
	String returnedUserName;
	
	
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
		borrowed = true;
	}
	public void return_book(User user) {
		returnedUserID = user.id;
		returnedUserName = user.name;
		return_date = new Date();
		borrowed = false;
	}
	public String status() {
		if (borrowed) {
			String out = "The book \"" + title + "\" is currently borrowed by " + lendedUserName + " since " + lending_date.toString();
			return out;
		} else {
			return "The book \"" + title + "\" is in the library";
		}
	}
	public boolean getBorrowed() {
		return borrowed;
	}
}
