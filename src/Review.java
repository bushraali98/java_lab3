public class Review {
    private String userName;
    private double ratings;
    private String comments;

    public Review(String userName, double ratings, String comments){
        this.userName = userName;
        this.ratings = ratings;
        this.comments = comments;
    }


    // Getters
    public double getRatings() {
        return ratings;
    }

    @Override
    public String toString() {
        return "User: " + this.userName + ", Rating: " + this.ratings + ", Comments: " + this.comments;
    }

}
