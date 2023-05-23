import com.sun.jdi.InconsistentDebugInfoException;

import java.util.ArrayList;

public class Core {
    // main control system of models and data structures
    Map map;
    ArrayList<Food> foods;
    ArrayList<Account> accounts;
    ArrayList<Comment> comments;
    ArrayList<Restaurant> restaurants;
    ArrayList<Order> orders;
    Account logeInAccount;
    public void login(String userName, String password) {

    }
    public void logout() {

    }
    public void addUser(String username, String password, String recoveryQuestion, String recoveryQuestionAnswer){

    }
    public void addDelivery(String username, String password, String recoveryQuestion, String recoveryQuestionAnswer){

    }
    public void addAdmin(String username, String password, String recoveryQuestion, String recoveryQuestionAnswer){

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
