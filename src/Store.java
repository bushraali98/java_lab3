import java.util.ArrayList;
import java.util.Arrays;

public class Store {

    ArrayList<Media> media;
    ArrayList<User> user;

    //Constractor
    public Store() {
        this.media = new ArrayList<>();
        this.user = new ArrayList<>();
    }

    public void addUser (User user) {
        this.user.add(user);
    }

    public void displayUsers() {
        for (User user: user){
            System.out.println(user.getUsername());
        }
    }

    public void addMedia(Media media) {
        this.media.add(media);
    }

    public void displayMedia() {
        for (Media media: media){
            System.out.println(media);
        }
    }

    public Book searchBook(String title) {
        for (Media media : media) {
            if (media instanceof Book && media.getTitle().equalsIgnoreCase(title)) {
                return (Book) media;
            }
        }
        return null;
    }



}
