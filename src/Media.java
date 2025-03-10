public class Media {
    private String title;
    private String auteur;
    private String ISBN;
    private double price;

    // Constractor
    public Media(String title, String auteur, String ISBN, double price) {
        this.title= title;
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.price = price;
    }

    // Setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    // Getters

    public String getTitle() {
        return title;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrice() {
        return price;
    }

    public String getMediaType() {
        return "Media";
    }

    public String toString() {
        return "Title: " + title + ", Auteur: " + auteur + ", ISBN: " + ISBN + ", Price: $" + price;
    }
}
