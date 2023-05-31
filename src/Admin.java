import java.util.HashSet;

public class Admin extends Account {
    private HashSet<Integer> restaurants = new HashSet<>();
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
    static public Admin getAdmin(int ID) {
        Admin result = new Admin("asdf", "1234", "asdf", "asdf", 1234);
        //TODO: get admin from file
        return result;
    }
    static public void saveAdmin(int ID, Admin admin) {
        //TODO: save admin to file
    }
}
