public class Comment {
    private int id, restaurantID, userId;
    private String commentText, answer;
    private boolean isAnswered;

    public int getId() {
        return id;
    }
    public int getRestaurantID() {
        return restaurantID;
    }
    public int getUserId() {
        return userId;
    }
    public String getAnswer() {
        return answer;
    }
    public String getCommentText() {
        return commentText;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public void setAnswered(boolean answered) {
        isAnswered = answered;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }
}
