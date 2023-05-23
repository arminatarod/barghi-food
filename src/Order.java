import java.util.HashMap;

public class Order {
    // bayad be noii zakhire kard hamrah in item takhfif chia gereftim
    private class FoodData {
        private int count, totalPrice;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(int totalPrice) {
            this.totalPrice = totalPrice;
        }
        public void addPrice(int value) {
            totalPrice += value;
        }
        public void addCount(int value) {
            count += value;
        }
    }
    private int id, restaurantID, userID, deliveryID, price;
    private String status;
    private HashMap<Integer, FoodData> items;
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
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public int getRestaurantID() {
        return restaurantID;
    }
    public int getId() {
        return id;
    }
    public int getDeliveryID() {
        return deliveryID;
    }
    public int getUserID() {
        return userID;
    }

    public void setItems(HashMap<Integer, FoodData> items) {
        this.items = items;
    }

    public HashMap<Integer, FoodData> getItems() {
        return items;
    }
    public void addItem(Food item) {
        if (item == null)
            return;
        if (items.containsKey(item.getId())) {
            FoodData tmp = items.get(item.getId());
            tmp.addCount(1);
            tmp.addPrice(item.getPrice());
        }
        else {
            FoodData tmp = new FoodData();
            tmp.setCount(1);
            tmp.setTotalPrice(item.getPrice());
            items.put(item.getId(), tmp);
        }
        price += item.getPrice();
    }
    public void removeItem(Food item) {
        if (item == null)
                return;
        if (items.containsKey(item.getId())) {
            FoodData tmp = items.get(item.getId());
            tmp.addCount(-1);
            tmp.addPrice(-item.getPrice());
            if (tmp.getCount() == 0)
                items.remove(item.getId());
            price += item.getPrice();
        }
    }
}
