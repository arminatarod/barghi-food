import java.util.*;

public class Admin extends Account {
    public HashSet<Integer> restaurants = new HashSet<>();
    public Admin(String userName, String password, String recoveryQuestion, String recoveryQuestionAnswer, int id) {
        super(userName, password, recoveryQuestion, recoveryQuestionAnswer, id);
    }
    public void addRestaurant (int restaurantID) {
        restaurants.add(restaurantID);
    }
    public void removeRestaurant(int restaurantID) {
        restaurants.remove(restaurantID);
    }
    public HashSet<Integer> getRestaurants() {
        return restaurants;
    }
    public void showRestaurants() {
        HashMap<String, Restaurant> mp = new HashMap<>();
        for(Integer restaurantId : restaurants) {
            mp.put(Restaurant.getRestaurant(restaurantId).getName(),Restaurant.getRestaurant(restaurantId));
        }

    }
    static public Admin getAdmin(int ID) {
        Admin result = new Admin("asdf", "1234", "asdf", "asdf", 1234);
        //TODO: get admin from file
        return result;
    }
    static public void saveAdmin(int ID, Admin admin) {
        //TODO: save admin to file
    }
}
