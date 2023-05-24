import java.util.ArrayList;

public class Admin extends Account {
    // admin of restaurants
    private ArrayList<Integer> restaurantsId; //id of restaurants
    private ArrayList<Restaurant> restaurants;
    int inChargeRestuarantId;

    public Admin(String userName, String password, String recoveryQuestion, String recoveryQuestionAnswer, int id) {
        super(userName, password, recoveryQuestion, recoveryQuestionAnswer, id);
    }

    public void addRestaurant (int restaurantID) {
        restaurantsId.add(restaurantID);
    }
    public int getRestaurant (int index) {
        return restaurantsId.get(index);
    }
    public void removeRestaurant(int id) {
        for (int i = 0; i < restaurants.size(); i++)
            if (restaurantsId.get(i) == id) {
                restaurants.remove(i);
                return;
            }
    }

    public void setInChargeRestuarant(int restuarantId) {

    }

    public ArrayList<Integer> getRestaurantsId() {
        return restaurantsId;
    }
}
