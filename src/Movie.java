import java.util.ArrayList;

public class Movie extends Media{
    private int duration;

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }



    public void watch (User user) {
        user.setPurchasedMedia(this);
    }

    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog) {
        ArrayList<Movie> recommends = new ArrayList<>();
        for (Movie movie : movieCatalog) {
            // checking for similar movies by the same auteur
            if (movie.getAuteur().equals(this.getAuteur()) && !movie.getTitle().equals(this.getTitle())) {
                recommends.add(movie);
            }
        }
        return recommends;
    }


    @Override
    public String getMediaType() {
        if (this.duration >= 120) {
            return "Long Movie";
        } else return "Movie";
    }

    @Override
    public String toString() {
        return super.toString() + "\nDuration: " + this.duration + " min";
    }
}
