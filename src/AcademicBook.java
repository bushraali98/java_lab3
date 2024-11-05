public class AcademicBook extends Book{

    private String subject;

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, String subject) {
        super(title, auteur, ISBN, price, stock);
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        return "Academic book";
    }

    @Override
    public String toString() {
        return super.toString() + "\n Subject: " + this.subject;
    }

}
