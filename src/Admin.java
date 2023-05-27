import java.util.ArrayList;
import java.util.HashMap;

public class Admin extends Account {
    private ArrayList<Restaurant> restaurants;
    private HashMap<Integer, Restaurant> IDtoRestaurant;
    public Admin(String userName, String password, String recoveryQuestion, String recoveryQuestionAnswer, int id) {
        super(userName, password, recoveryQuestion, recoveryQuestionAnswer, id);
    }
    public void addRestaurant (Restaurant restaurant) {
        restaurants.add(restaurant);
    }
    public void removeRestaurant(Restaurant restaurant) {
        restaurants.remove(restaurant);
    }
    public HashMap<Integer, Restaurant> getIDtoRestaurant() {
        return IDtoRestaurant;
    }
}
