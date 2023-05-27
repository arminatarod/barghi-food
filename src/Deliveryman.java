import java.util.ArrayList;

public class Deliveryman extends Account {
    private int location, balance;
    private ArrayList<Integer> orders;
    private int activeOrder;

    public Deliveryman(String userName, String password, String recoveryQuestion, String recoveryQuestionAnswer, int id) {
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
    public int getBalance() {
        return balance;
    }
    public void addMoney(int amount) {
        balance += amount;
    }
    public int getActiveOrder() {
        return activeOrder;
    }
    public void setActiveOrder(int activeOrder) {
        this.activeOrder = activeOrder;
    }
}
