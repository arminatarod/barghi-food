import java.util.ArrayList;

public class Admin extends Account {
    // admin of restaurants
    private ArrayList<Integer> restaurants; //id of restaurants
    public void addRestaurant (int restaurantID) {
        restaurants.add(restaurantID);
    }
    public int getRestaurant (int index) {
        return restaurants.get(index);
    }
    public void removeRestaurant(int id) {
        for (int i = 0; i < restaurants.size(); i++)
            if (restaurants.get(i) == id) {
                restaurants.remove(i);
                return;
            }
    }
    public ArrayList<Integer> getRestaurants() {
        return restaurants;
    }
}
