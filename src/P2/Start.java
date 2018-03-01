package P2;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[4];
		library[0] = new Book("Crime fiction", "Finding bigfoot", "Morten", "Aalborg University");
		library[1] = new Book("Science fiction", "Lord of the space ting", "Damiano", "Aalborg University");
		library[2] = new Book("Pure fire", "Da ting goes mans not hot", "Big Shaq", "Island Records");
		library[3] = new Book("Romantic Comedy", "You can do small kids", "Hendrik", "Aalborg University");
		User bigShaq = new User("Big Shaq", "Mansnothot");

		library[0].borrow(bigShaq);
		System.out.println(library[0].status());
		library[0].return_book(bigShaq);
		System.out.println(library[0].status());

		for (Book book : library) {
			if (book.getBorrowed()) {
				System.out.println("The book " + book.title + " by " + book.author + " is currently borrowed out.");
			} else {
				System.out.println("The book " + book.title + " by " + book.author + " is not currently borrowed out.");

			}
		}
	}

}
