import java.util.ArrayList;

public class User {

    private String username;
    private String email;
    private ArrayList<Media> purchasedMedia;
    private ArrayList<Media> shoppingCart;

    // Constractor
    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchasedMedia = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    // Getter


    public String getUsername() {
        return this.username;
    }

    // Setter
    public void setPurchasedMedia(Media media) {
        this.purchasedMedia.add(media);
    }


    // Methods
    public void addToCart(Media media){
        this.shoppingCart.add(media);
    }

    public void removeFromCart(Media media) {
        this.shoppingCart.remove(media);
    }

    public void checkOut() {
        this.purchasedMedia.addAll(this.shoppingCart);
        this.shoppingCart.clear();
    }



}

