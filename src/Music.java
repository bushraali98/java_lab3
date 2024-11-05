import java.util.ArrayList;

public class Music extends Media{
    private String artist;

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }


    public void listen(User user) {
        user.setPurchasedMedia(this);
    }

    public ArrayList<Music> generatePlaylist(ArrayList<Music> musicCatalog) {
        ArrayList<Music> playlist = new ArrayList<>();
        for (Music music : musicCatalog) {
            if (music.getAuteur().equals(this.getAuteur())) {
                playlist.add(music);
            }
        }
        return playlist;
    }


    @Override
    public String getMediaType() {
        if (getPrice() >= 10){
            return "Premium Music";
        } else return "Music";
    }

    @Override
    public String toString() {
        return super.toString() + " \nArtist: " + this.artist;
    }
}
