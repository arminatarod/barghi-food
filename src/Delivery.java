import java.util.ArrayList;

public class Delivery extends Account {
    // delivery man class
    // yek esm behtar baraye money erae bedin : )
    private int location, money;
    private ArrayList<Integer> orders;
    private int activeOrder;

    public Delivery(String userName, String password, String recoveryQuestion, String recoveryQuestionAnswer, int id) {
        super(userName, password, recoveryQuestion, recoveryQuestionAnswer, id);
    }

    public int getLocation() {
        return location;
    }
    public void setLocation(int location) {
        this.location = location;
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
    public int getMoney() {
        return money;
    }
    public void addMoney(int value) {
        money += value;
    }
    public int getActiveOrder() {
        return activeOrder;
    }
    public void setActiveOrder(int activeOrder) {
        this.activeOrder = activeOrder;
    }
}
