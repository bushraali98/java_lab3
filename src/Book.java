import java.util.ArrayList;

public class Book extends Media{

    private int stock;
    private ArrayList<Review> reviews;

    // Constractor
    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public double getAvrageRating() {
        if (reviews.isEmpty()) return 0.0;

        double total = 0.0;
        for (Review review : reviews) {
            total += review.getRatings();
        }
        return total / reviews.size();
    }

    public int getStock() {
        return this.stock;
    }

    public void purchase(User user) {
        if (stock > 0) {
            user.setPurchasedMedia(this);
            stock--;
        } else {
            System.out.println("Out of stock");
        }
    }

    public boolean isBestseller() {
        if (this.getAvrageRating() >= 4.5) {
            return true;
        } else return false;
    }

    public void restock(int quantity) {
        this.stock += quantity;
        System.out.println("Book have been restocked successfuly");
        System.out.println("The new stock is: " + this.stock);
    }

    @Override
    public String getMediaType() {
        if (this.getAvrageRating() >= 4.5) {
            return "Bestselling Book";
        }
        return "Book";
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + "\nAuteur: " + getAuteur() + "\nISBN: " + getISBN() + "\nPrice: " + getPrice() + "\nStock: " + getStock() + "\nReviews: " + this.reviews;
    }
}
