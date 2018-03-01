package P2;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[4];
		library[0] = new Book("Adventure", "Treasure Island", "Robert Louis Stevenson", "Penguin Books");
		library[1] = new Book("Science fiction", "Stars Like Dust", "Isaac Asimov", "Penguin Books");
		library[2] = new Book("History", "Shogun", "James Clavell", "Penguin Books");
		library[3] = new Book("Fantasy", "The Metamorphosis", "Franz Kafka", "Penguin Books");
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
