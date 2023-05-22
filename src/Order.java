import java.util.ArrayList;

public class Order {
    private int id, restaurantID, userID, deliveryID, price;
    private String status;

    //pair nadare in kofti ? ba tedad negah daram ?
    // bayad be noii zakhire kard hamrah in item takhfif chia gereftim
    ArrayList<Integer> items;

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDeliveryID(int deliveryID) {
        this.deliveryID = deliveryID;
    }
    public void setItems(ArrayList<Integer> items) {
        this.items = items;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public int getRestaurantID() {
        return restaurantID;
    }
    public int getId() {
        return id;
    }
    public ArrayList<Integer> getItems() {
        return items;
    }
    public int getDeliveryID() {
        return deliveryID;
    }
    public int getUserID() {
        return userID;
    }
    public void addItem (int itemID) {
        items.add(itemID);
    }
}
