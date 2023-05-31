import java.util.HashSet;

public class User extends Account {
    private HashSet<Integer> locations, orders, comments;
    private Order cart;
    private int balance;
    public User(String userName, String password, String recoveryQuestion, String recoveryQuestionAnswer, int id) {
        super(userName, password, recoveryQuestion, recoveryQuestionAnswer, id);
    }
    public Order getCart() {
        return cart;
    }
    public void addLocation(int location) {
        locations.add(location);
    }
    public void addOrder(int orderID) {
        orders.add(orderID);
    }
    public HashSet<Integer> getOrders() {
        return orders;
    }
    public HashSet<Integer> getComments() {
        return comments;
    }
    public HashSet<Integer> getLocations() {
        return locations;
    }
    public void setBalance(int amount) {
        this.balance = amount;
    }
    public int getBalance() {
        return balance;
    }
    public void addBalance(int amount) {
        this.balance += amount;
    }
    public void addComment(int commentID) {
        comments.add(commentID);
    }
    public void removeLocation(int id) {
        locations.remove(id);
    }
    static public User getUser(int ID) {
        User result = new User("asdf", "1234", "asdf", "asdf", 1234);
        //TODO: get user from file
        return result;
    }
    static public void saveUser(int ID, User user) {
        //TODO: save user to file
    }
}
