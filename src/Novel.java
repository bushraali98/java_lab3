public class Novel extends Book{

    private String genre;

    // Constractor
    public Novel(String title, String auteur, String ISBN, double price, int stock, String genre) {
        super(title, auteur, ISBN, price, stock);
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
        return isBestseller() ? "Bestselling Novel" : "Novel";
    }

    @Override
    public String toString() {
        return super.toString() + "\nGenre: " + this.genre;
    }

}
