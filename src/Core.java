import java.util.ArrayList;
import java.util.HashMap;

public class Core {
    Map map;
    ArrayList<Food> foods;
    ArrayList<Account> accounts;
    HashMap<Integer, Restaurant> IDtoRestaurant;
    ArrayList<Order> orders;
    Account loggedInAccount = null;
    User loggedInUser = null;
    Admin loggedInAdmin = null;
    Deliveryman loggedInDelivery = null;
    Restaurant selectedRestaurant = null;
    Food selectedFood = null;
    public void loginUser(String userName, String password) {
        if (loggedInAdmin != null || loggedInDelivery != null || loggedInUser != null) {
            System.out.println("You are already logged in.");
            return;
        }
        for (Account acc : accounts) {
            if (userName.equals(acc.getUsername())) {
                if (password.equals(acc.getPassword())) {
                    System.out.println("Logged in successfully.");
                    loggedInUser = (User) acc;
                    loggedInAccount = acc;
                    return;
                }
                System.out.println("Incorrect password!");
                return;
            }
        }
        System.out.println("There is no account with this username!");
    }
    public void loginAdmin(String userName, String password) {
        if (loggedInAdmin != null || loggedInDelivery != null || loggedInUser != null) {
            System.out.println("You are already logged in.");
            return;
        }
        for (Account acc : accounts) {
            if (userName.equals(acc.getUsername())) {
                if (password.equals(acc.getPassword())) {
                    System.out.println("Logged in successfully.");
                    loggedInAdmin = (Admin) acc;
                    loggedInAccount = acc;
                    return;
                }
                System.out.println("Incorrect password!");
                return;
            }
        }
        System.out.println("There is no account with this username!");
    }
    public void loginDeliveryman(String userName, String password) {
        if (loggedInAdmin != null || loggedInDelivery != null || loggedInUser != null) {
            System.out.println("You are already logged in.");
            return;
        }
        for (Account acc : accounts) {
            if (userName.equals(acc.getUsername())) {
                if (password.equals(acc.getPassword())) {
                    System.out.println("Logged in successfully.");
                    loggedInDelivery = (Deliveryman) acc;
                    loggedInAccount = acc;
                    return;
                }
                System.out.println("Incorrect password!");
                return;
            }
        }
        System.out.println("There is no account with this username!");
    }
    public void logout() {
        if (loggedInAccount == null) {
            System.out.println("No one has logged in!");
        } else {
            if (loggedInDelivery != null) {
                System.out.println("Logged out successfully.");
                loggedInDelivery = null;
            } else if (loggedInUser != null) {
                System.out.println("Logged out successfully.");
                loggedInAdmin = null;
            } else {
                System.out.println("Logged out successfully.");
                loggedInUser = null;
            }
        }
    }
    public void addUser(String username, String password, String recoveryQuestion, String recoveryQuestionAnswer) {
        accounts.add(new User(username, password, recoveryQuestion, recoveryQuestionAnswer, accounts.size()));
    }
    public void addDelivery(String username, String password, String recoveryQuestion, String recoveryQuestionAnswer) {
        accounts.add(new Deliveryman(username, password, recoveryQuestion, recoveryQuestionAnswer, accounts.size()));
    }
    public void addAdmin(String username, String password, String recoveryQuestion, String recoveryQuestionAnswer) {
        accounts.add(new Admin(username, password, recoveryQuestion, recoveryQuestionAnswer, accounts.size()));
    }
    public void showLocation() {
        if (selectedRestaurant == null) {
            System.out.println("No restaurant has been selected!");
            return;
        }
        System.out.println(selectedRestaurant.getLocation());
    }
    public void editLocation(int nodeID) {
        if (selectedRestaurant == null) {
            System.out.println("No restaurant has been selected!");
            return;
        }
        selectedRestaurant.setLocation(nodeID);
        System.out.println("The location has been updated successfully.");
    }
    public void showFoodType() {
        if (selectedRestaurant == null) {
            System.out.println("No restaurant has been selected!");
            return;
        }
        for (String s : selectedRestaurant.getFoodType())
            System.out.println(s);
    }
    public int addFoodType(String type, boolean forSure) {
        if (selectedRestaurant == null) {
            System.out.println("No restaurant has been selected!");
            return 1;
        } else if (!selectedRestaurant.getActiveOrders().isEmpty()) {
            System.out.println("The restaurant has active orders!");
            return 2;
        } else if (selectedRestaurant.getFoodType().contains(type)) {
            System.out.println("The restaurant already contains this food type!");
            return 3;
        } else if (!forSure) {
            System.out.println("ARE YOU SURE YOU WANT TO ADD THIS FOOD TYPE TO YOUR RESTAURANT?");
            return 4;
        } else {
            selectedRestaurant.addFoodType(type);
            System.out.println("Food type added successfully.");
            return 0;
        }
    }
    public int removeFoodType(String type, boolean forSure) {
        if (selectedRestaurant == null) {
            System.out.println("No restaurant has been selected!");
            return 1;
        } else if (!selectedRestaurant.getActiveOrders().isEmpty()) {
            System.out.println("The restaurant has active orders!");
            return 2;
        } else if (!selectedRestaurant.getFoodType().contains(type)) {
            System.out.println("The restaurant does not contain this food type!");
            return 3;
        } else if (!forSure) {
            System.out.println("ARE YOU SURE YOU WANT TO REMOVE THIS FOOD TYPE FROM YOUR RESTAURANT?");
            return 4;
        } else {
            selectedRestaurant.removeFoodType(type);
            selectedRestaurant.deleteMenu();
            return 0;
        }
    }
    public int editFoodType(String typeToRemove, String typeToAdd, boolean forSure) {
        if (selectedRestaurant == null) {
            System.out.println("No restaurant has been selected!");
            return 1;
        } else if (!selectedRestaurant.getActiveOrders().isEmpty()) {
            System.out.println("The restaurant has active orders!");
            return 2;
        } else if (!selectedRestaurant.getFoodType().contains(typeToRemove)) {
            System.out.println("The restaurant does not contain the given food type!");
            return 3;
        } else if (selectedRestaurant.getFoodType().contains(typeToAdd)) {
            System.out.println("The restaurant already contains the given food type!");
            return 4;
        } else if (!forSure) {
            System.out.println("ARE YOU SURE YOU WANT TO EDIT THIS FOOD TYPE IN YOUR RESTAURANT?");
            return 5;
        } else {
            selectedRestaurant.removeFoodType(typeToRemove);
            selectedRestaurant.addFoodType(typeToAdd);
            selectedRestaurant.deleteMenu();
            return 0;
        }
    }
    public void showMenu() {
        if (selectedRestaurant == null) {
            System.out.println("No restaurant has been selected!");
            return;
        }
        for (Food f : selectedRestaurant.getMenu())
            System.out.println("ID: " + f.getId() + ", NAME: " + f.getName() + ", PRICE: " + f.getPrice() + ", DISCOUNT: " + f.getDiscount() + ", RATING: " + f.getAverageRating() + ", IS ACTIVE: " + f.getActive());
    }
    public void editFoodPrice(int foodID, int price) {
        if (selectedRestaurant == null) {
            System.out.println("No restaurant has been selected!");
            return;
        } else if (!selectedRestaurant.getIDtoFood().containsKey(foodID)) {
            System.out.println("The selected restaurant does not have a food with the given ID!");
        } else {
            selectedRestaurant.getMenu().get(selectedRestaurant.getMenu().indexOf(selectedRestaurant.getIDtoFood().get(foodID))).setPrice(price);
            System.out.println("Information updated successfully.");
        }
    }
    public void editFoodName(int foodID, String newName) {
        if (selectedRestaurant == null) {
            System.out.println("No restaurant has been selected!");
            return;
        } else if (!selectedRestaurant.getIDtoFood().containsKey(foodID)) {
            System.out.println("The selected restaurant does not have a food with the given ID!");
        } else {
            selectedRestaurant.getMenu().get(selectedRestaurant.getMenu().indexOf(selectedRestaurant.getIDtoFood().get(foodID))).setName(newName);
            System.out.println("Information updated successfully.");
        }
    }
    public void addFood(String foodName, int foodPrice) {

    }
    public void activateFood(int foodID) {
        if (selectedRestaurant == null) {
            System.out.println("No restaurant has been selected!");
            return;
        } else if (!selectedRestaurant.getIDtoFood().containsKey(foodID)) {
            System.out.println("The selected restaurant does not have a food with the given ID!");
        } else {
            selectedRestaurant.getMenu().get(selectedRestaurant.getMenu().indexOf(selectedRestaurant.getIDtoFood().get(foodID))).setActive(true);
            System.out.println("Information updated successfully.");
        }
    }
    public void deactivateFood(int foodID) {

    }
    public void discountFood(int foodID, int discountPercentage, int timestamp) {
        if (selectedRestaurant == null) {
            System.out.println("No restaurant has been selected!");
            return;
        } else if (!selectedRestaurant.getIDtoFood().containsKey(foodID)) {
            System.out.println("The selected restaurant does not have a food with the given ID!");
        } else {
            selectedRestaurant.getMenu().get(selectedRestaurant.getMenu().indexOf(selectedRestaurant.getIDtoFood().get(foodID))).setDiscount(discountPercentage, timestamp);
            System.out.println("Information updated successfully.");
        }
    }
    public void selectFood(int foodID) {
        if (selectedRestaurant == null) {
            System.out.println("No restaurant has been selected!");
        } else if (!selectedRestaurant.getIDtoFood().containsKey(foodID)) {
            System.out.println("The selected restaurant does not have a food with the given ID!");
        } else {
            selectedFood = selectedRestaurant.getIDtoFood().get(foodID);
            System.out.println("Food selected successfully.");
        }
    }
    public void displayRating() {
        if (selectedFood == null) {
            System.out.println("No food has been selected!");
        } else {
            System.out.println("AVERAGE RATING: " + selectedFood.getAverageRating());
        }
    }
    public void displayComments() {
        if (selectedFood == null) {
            System.out.println("No food has been selected!");
        } else {
            for (Comment c : selectedFood.getComments())
                System.out.println("ID: " + c.getId() + ", USER: " + c.getCommenter().getUsername() + ", CONTENT: " + c.getContent() + ", RESPONSE: " + c.getAnswer());
        }
    }
    public void addResponse(int commentID, String message) {
        if (selectedFood == null) {
            System.out.println("No food has been selected!");
        } else if (!selectedFood.getIDtoComment().containsKey(commentID)) {
            System.out.println("The selected food does not have a comment with the given ID!");
        } else if (selectedFood.getIDtoComment().get(commentID).getAnswer() != null) {
            System.out.println("This comment has already been answered!");
        } else {
            selectedFood.getIDtoComment().get(commentID).setAnswer(message);
            System.out.println("Response added successfully.");
        }
    }
    public void editResponse(int commentID, String message) {
        if (selectedFood == null) {
            System.out.println("No food has been selected!");
        } else if (!selectedFood.getIDtoComment().containsKey(commentID)) {
            System.out.println("The selected food does not have a comment with the given ID!");
        } else if (selectedFood.getIDtoComment().get(commentID).getAnswer() == null) {
            System.out.println("This comment has never been answered!");
        } else {
            selectedFood.getIDtoComment().get(commentID).setAnswer(message);
            System.out.println("Response edited successfully.");
        }
    }
    public void unselectFood() {
        if (selectedFood == null) {
            System.out.println("No food has been selected!");
        } else {
            selectedFood = null;
            System.out.println("Food unselected successfully.");
        }
    }
    public void unselectRestaurant() {
        if (selectedRestaurant == null) {
            System.out.println("No restaurant has been selected!");
        } else {
            selectedRestaurant = null;
            System.out.println("Restaurant unselected successfully.");
        }
    }
    public void displayActiveOrders() {

    }
    public void editOrderStatus(int OrderId, String Status) {

    }
    // time handel shavad
    public void editOrderDeliveryTime(int OrderTime, int time) {

    }
    public void showOrderHistory() {
        if (selectedRestaurant == null) {
            System.out.println("No restaurant has been selected!");
        } else {
            for (Order o : selectedRestaurant.getOrders())
                System.out.println("ID: " + o.getId() + ", STATUS: " + o.getStatus() + ", DELIVERYMAN: " + o.getDeliveryman() + ", USER: " + o.getUser().getUsername() + ", PRICE: " + o.getPrice());
        }
    }
    /// modirate sefaresh :::::::
    public void selectRestaurant(int restaurantID) {
        if (loggedInAdmin == null && loggedInUser == null) {
            System.out.println("No admin has logged in!");
        } else {
            selectedRestaurant = IDtoRestaurant.get(restaurantID);
            System.out.println("Restaurant successfully selected.");
        }
    }
    public void searchRestaurantName(String name) {

    }
    public void searchFoodName(String name) {

    }
    public void addComment(String content) {
        if (selectedFood == null) {
            System.out.println("No food has been selected!");
        } else if (selectedFood.getRestaurant().getAdmin().equals(loggedInAdmin)) {
            System.out.println("You cannot write comments on your own products!");
        } else {
            Comment c = new Comment();
            c.setCommenter(loggedInAdmin == null? (loggedInUser == null? loggedInDelivery : loggedInUser) : loggedInAdmin);
            c.setContent(content);
            //TODO: set ID
            System.out.println("Comment added successfully.");
        }
    }
    public void editComment(int commentID, String content) {
        if (selectedFood == null) {
            System.out.println("No food has been selected!");
        } else if (!selectedFood.getIDtoComment().get(commentID).getCommenter().equals(loggedInAccount)) {
            System.out.println("You can only edit your own comments!");
        } else {
            selectedFood.getIDtoComment().get(commentID).setContent(content);
            System.out.println("Comment edited successfully.");
        }
    }
    public void submitRating(int rating) {
        if (selectedFood == null) {
            System.out.println("No food has been selected!");
        } else if (selectedFood.getRaters().contains(loggedInAccount)) {
            System.out.println("You have already added a rating for this food!");
        } else {
            selectedFood.addRating(loggedInAccount, rating);
            System.out.println("Rating submitted successfully.");
        }
    }
    public void editRating(int rating) {
        if (selectedFood == null) {
            System.out.println("No food has been selected!");
        } else if (!selectedFood.getRaters().contains(loggedInAccount)) {
            System.out.println("You have not submitted a rating for this food!");
        } else {
            selectedFood.addRating(loggedInAccount, rating);
            System.out.println("Rating submitted successfully.");
        }
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
    public void chargeAccount(int value) {

    }
    public void displayAccountBalance() {

    }
    public void showPath() {

    }
    public void suggestFood() {

    }
}
