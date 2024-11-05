public class Main {
    public static void main(String[] args) {
        // Create object from store
        Store store = new Store();

        // Create users
        User user1 = new User("boshra", "boshra@gamil.com");
        User user2 = new User("sara", "sara@gmail.com");

        // Adding users to the store
        store.addUser(user1);
        store.addUser(user2);

        // Creating media objects
        Book book1 = new Book("Python for Data Science", "Michael Green", "ISBN54321", 29.99, 10);
        Movie movie1 = new Movie("The Matrix", "Wachowski Brothers", "ISBN11223", 24.99, 136);
        Music music1 = new Music("Thriller", "Michael Jackson", "ISBN66778", 9.99, "Michael Jackson");

        // Adding media to the store
        store.addMedia(book1);
        store.addMedia(movie1);
        store.addMedia(music1);

        // Display media
        System.out.println("List of media in the store:");
        store.displayMedia();

        // Add reviews to the book
        Review review1 = new Review("boshra", 4.5, "Great book for learning Data Science");
        Review review2 = new Review("Sara", 5.0, "Good book and easy to learn.");
        book1.addReview(review1);
        book1.addReview(review2);

        // Calculate average rating
        System.out.println("\nAverage rating of " + book1.getTitle() + " is: " + book1.getAvrageRating());

        // Check if the book is a bestseller
        System.out.println("Is the book a bestseller? " + book1.isBestseller());

        // Purchase
        book1.purchase(user1);
        movie1.watch(user2);
        music1.listen(user1);

        // Display stock after purchase
        System.out.println("\nStock after purchase:");
        System.out.println(book1.getTitle() + " stock: " + book1.getStock());

        // Display all users
        System.out.println("\nList of users:");
        store.displayUsers();

        // Testing restocking
        System.out.println("\nRestocking the book:");
        book1.restock(5);

        // Display media list after restock
        System.out.println("\nUpdated media list:");
        store.displayMedia();

        // Search for a book by title
        String searchTitle = "Java Programming";
        Book foundBook = store.searchBook(searchTitle);
        if (foundBook != null) {
            System.out.println("\nBook found: " + foundBook);
        } else {
            System.out.println("\nBook not found with title: " + searchTitle);
        }


    }
}