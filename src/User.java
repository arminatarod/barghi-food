import java.util.ArrayList;

public class User extends Account {
    // ordinary user class
    private ArrayList<Integer> locations, orders, comments; // order deliver locations (ids of graph node) & ids of orders & ids of comments
    private Order cart;
    private int charge;
    public Order getCart() {
        return cart;
    }
    public void addLocation(int location) {
        locations.add(location);
    }
    public int getLocation(int index) {
        return locations.get(index);
    }
    public int getOrder(int index) {
        return orders.get(index);
    }
    public void addOrder(int orderID) {
        orders.add(orderID);
    }
    public ArrayList<Integer> getOrders() {
        return orders;
    }
    public ArrayList<Integer> getComments() {
        return comments;
    }
    public ArrayList<Integer> getLocations() {
        return locations;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }
    public int getCharge() {
        return charge;
    }
    public void addCharge (int value) {
        charge += value;
    }
    public void addComment(int commentID) {
        comments.add(commentID);
    }
    public int getComment(int index) {
        return comments.get(index);
    }
    public void removeLocations(int id) {
        for (int i = 0; i < locations.size(); i++)
            if (locations.get(i) == id) {
                locations.remove(i);
                return;
            }
    }


}
