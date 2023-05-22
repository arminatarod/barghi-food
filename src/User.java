import java.util.ArrayList;

public class User extends Account {
    // ordinary user class
    private ArrayList<Integer> locations, orders, comments; // order deliver locations (ids of graph node) & ids of orders & ids of comments
    private Order cart;
    private int charge;
    private ArrayList<Coupon> coupons;
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
    public ArrayList<Coupon> getCoupons() {
        return coupons;
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

    public void addCoupon (Coupon x) {
        coupons.add(x);
    }
    public Coupon getCoupon (int index){
        return coupons.get(index);
    }
    public void addComment(int commentID) {
        comments.add(commentID);
    }
    public int getComment(int index) {
        return comments.get(index);
    }

}
