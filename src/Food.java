import java.util.ArrayList;
import java.util.HashMap;

public class Food {
    private int id, price, discount, discountTimestamp;
    private Restaurant restaurant;
    private double averageRating;
    private ArrayList<Account> raters = new ArrayList<>();
    // baraye bakhsh graphic khobe aksesham dashte bashim !? ye string url
    private String name;
    private boolean activeDiscount, isActive;
    private ArrayList<Comment> comments = new ArrayList<>();
    private HashMap<Integer, Comment> IDtoComment = new HashMap<>();

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    public void setDiscount(int discount, int timestamp) {
        this.discount = discount;
        this.discountTimestamp = timestamp;
    }
    public int getDiscount() {
        return discount;
    }
    public int getDiscountTimestamp() {
        return discountTimestamp;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public boolean getActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }
    public void setActiveDiscount(boolean activeDiscount) {
        this.activeDiscount = activeDiscount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public double getAverageRating() {
        return averageRating;
    }
    public int getRatingCount() {
        return raters.size();
    }
    public void addRating(Account rater, int rating) {
        averageRating = (averageRating * raters.size() + rating) / (raters.size() + 1);
        raters.add(rater);
    }
    public Restaurant getRestaurant() {
        return restaurant;
    }
    public void editRating(int oldRating, int newRating) {
        averageRating = (averageRating * raters.size() - oldRating + newRating) / raters.size();
    }
    public ArrayList<Comment> getComments() {
        return comments;
    }
    public HashMap<Integer, Comment> getIDtoComment() {
        return IDtoComment;
    }
    public ArrayList<Account> getRaters() {
        return raters;
    }
}
