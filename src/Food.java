public class Food {
    private int id, price, averageRating, ratingCount, restaurantID;
    // baraye bakhsh graphic khobe aksesham dashte bashim !? ye string url
    private String name;
    private boolean activeDiscount, isActive;
    // time stamp toye file neveshte chie ?

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
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
    public int getAverageRating() {
        return averageRating;
    }
    public int getRatingCount() {
        return ratingCount;
    }
    public void addRating(int rating) {
        averageRating = (averageRating * ratingCount + rating) / (ratingCount + 1);
        ratingCount++;
    }
    public int getRestaurantID() {
        return restaurantID;
    }

    public void editRating(int oldRating, int newRating) {

    }
}
