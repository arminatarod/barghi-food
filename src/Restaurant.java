import java.util.ArrayList;
import java.util.HashMap;

public class Restaurant {
    private int location, balance, ratingCount;
    private Admin admin;
    // add active order array list
    private double averageRating;
    private String name;
    private ArrayList<Order> orders, activeOrders;
    private ArrayList<Comment> comments;
    private ArrayList<Food> menu;
    private ArrayList<String> foodType;
    private HashMap<Integer, Food> IDtoFood = new HashMap<>();

    public void setFoodType(ArrayList<String> foodType) {
        this.foodType = foodType;
    }
    public ArrayList<String> getFoodType() {
        return foodType;
    }
    public void addFoodType(String type) {
        foodType.add(type);
    }
    public void removeFoodType(String type) {
        foodType.remove(type);
    }
    public void setLocation(int location) {
        this.location = location;
    }
    public int getLocation() {
        return location;
    }
    public void addOrder(Order order) {
        activeOrders.add(order);
    }
    public ArrayList<Order> getOrders() {
        return orders;
    }
    public ArrayList<Order> getActiveOrders() {
        return activeOrders;
    }
    public int getBalance() {
        return balance;
    }
    public void addBalance(int value) {
        balance += value;
    }
    public HashMap<Integer, Food> getIDtoFood() {
        return IDtoFood;
    }
    public ArrayList<Food> getMenu() {
        return menu;
    }
    public void addMenuItem(Food menuItem) {
        menu.add(menuItem);
        IDtoFood.put(menuItem.getId(), menuItem);
    }
    public void deleteMenu() {
        menu.clear();
    }
    public double getAverageRating() {
        return averageRating;
    }
    public int getRatingCount() {
        return ratingCount;
    }
    public void addRating(int rating) {
        averageRating = (averageRating * ratingCount + rating) / (ratingCount + 1);
        ratingCount++;
    }
    public void editRating(int oldRating, int newRating) {
        averageRating = (averageRating * ratingCount - oldRating + newRating) / ratingCount;
    }
    public void addComment(Comment comment) {
        comments.add(comment);
    }
    public ArrayList<Comment> getComments() {
        return comments;
    }
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public Admin getAdmin() {
        return admin;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
