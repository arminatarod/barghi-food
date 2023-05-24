import java.util.ArrayList;

public class Core {
    // main control system of models and data structures
    Map map;
    ArrayList<Food> foods;
    ArrayList<Account> accounts;
    ArrayList<Comment> comments;
    ArrayList<Restaurant> restaurants;
    ArrayList<Order> orders;
    User loggedInUser = null;
    Admin loggedInAdmin = null;
    Delivery loggedInDelivery = null;
    public void loginUser(String userName, String password) {
        for(Account acc : accounts)
        {
            if(userName.equals(acc.getUserName()))
            {
                if(password.equals(acc.getPassword()))
                {
                    System.out.println("logged in successfully.");
                    loggedInUser = (User) acc;
                    break;
                }
                System.out.println("input password is wrong!!!!");
                break;
            }
        }
        System.out.println("There is no account with this username!!!!");
    }
    public void loginAdmin(String userName, String password) {
        for(Account acc : accounts)
        {
            if(userName.equals(acc.getUserName()))
            {
                if(password.equals(acc.getPassword()))
                {
                    System.out.println("logged in successfully.");
                    loggedInAdmin = (Admin) acc;
                    break;
                }
                System.out.println("input password is wrong!!!!");
                break;
            }
        }
        System.out.println("There is no account with this username!!!!");
    }
    public void loginDelivery(String userName, String password) {
        for(Account acc : accounts)
        {
            if(userName.equals(acc.getUserName()))
            {
                if(password.equals(acc.getPassword()))
                {
                    System.out.println("logged in successfully.");
                    loggedInDelivery = (Delivery) acc;
                    break;
                }
                System.out.println("input password is wrong!!!!");
                break;
            }
        }
        System.out.println("There is no account with this username!!!!");
    }
    public void logout() {
        if(loggedInAdmin == null || loggedInDelivery == null || loggedInUser == null)
        {
            System.out.println("No one has logged in!!!");
        }
        else
        {
            if(loggedInDelivery != null)
            {
                System.out.println("Logged out successfully.");
                loggedInDelivery = null;
            }
            else if(loggedInUser != null)
            {
                System.out.println("Logged out successfully.");
                loggedInAdmin = null;
            }
            else
            {
                System.out.println("Logged out successfully.");
                loggedInUser = null;
            }
        }
    }
    public void addUser(String username, String password, String recoveryQuestion, String recoveryQuestionAnswer){
        accounts.add(new User(username,password,recoveryQuestion,recoveryQuestionAnswer,accounts.size()));
    }
    public void addDelivery(String username, String password, String recoveryQuestion, String recoveryQuestionAnswer){
        accounts.add(new Delivery(username,password,recoveryQuestion,recoveryQuestionAnswer,accounts.size()));
    }
    public void addAdmin(String username, String password, String recoveryQuestion, String recoveryQuestionAnswer){
        accounts.add(new Admin(username,password,recoveryQuestion,recoveryQuestionAnswer,accounts.size()));
    }
    public void showLocation() {

    }
    public void editLocation(int nodeID) { //input ?

    }
    public void showFoodType() {

    }
    public void addFoodType(String type) {

    }
    public void removeFoodType(String type) {

    }
    public void editFoodType(String types) {

    }
    public void deleteFoodType() {

    }
    public void showMenu(){

    }
    public void editFoodPrice(String foodName, int price){

    }
    public void editFoodName (String foodName, String newName) {

    }
    public void addFood (String foodName, int foodPrice) {

    }
    public void activateFood (String foodName) {

    }
    public void deactivateFood(String foodName){

    }
    public void discountFood(int id, int discountPercentage, int timeStamp){

    }
    public void selectFood(int foodID){

    }
    public void displayRating(){

    }
    public void displayComment() {

    }
    public void addResponse(int commentID, String message) {

    }
    public void editResponse(int commentID, String message) {

    }
    //return ro yeki ok kone
    public void displayActiveOrders() {

    }
    public void editOrderStatus(int OrderId, String Status) {

    }
    // time handel shavad
    public void editOrderDeliveryTime(int OrderTime, int time) {

    }
    public void showOrderHistory() {

    }
    /// modirate sefaresh :::::::
    public void selectRestaurant(int restaurantID){
        if(loggedInAdmin == null)
        {
            System.out.println("Admin has not logged in!!!!");
        }
        else
        {
            loggedInAdmin.setInChargeRestuarant(restaurantID);
        }
    }
    public void searchRestaurantName(String name) {

    }
    public void searchFoodName(String name) {

    }
    public void addComment(String message) {

    }
    public void editComment(int commentID) {

    }
    public void submitRating(int rating) {

    }
    public void editRating(int rating) {

    }
    public void addToCart(int count) {

    }
    public void selectOrder(int id) {

    }
    public void showCart() {

    }
    public void confirmOrder() {

    }
    public void showEstimatedDeliveryTime() {

    }
    public void chargeAccount (int value) {

    }
    public void displayAccountCharge() {

    }
    public void showPath() {

    }
    public void foodSuggest() {

    }
}
