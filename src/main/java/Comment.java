public class Comment {
    private int id;
    private String content, answer;
    private int commenterID;

    public int getId() {
        return id;
    }
    public int getCommenter() {
        return commenterID;
    }
    public String getAnswer() {
        return answer;
    }
    public String getContent() {
        return content;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCommenter(int commenterID) {
        this.commenterID = commenterID;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public void setContent(String commentText) {
        this.content = commentText;
    }
    static public Comment getComment(int ID) {
        Comment result = new Comment();
        //TODO: get comment from file
        return result;
    }
    static public void saveComment(int ID, Comment comment) {
        //TODO: save comment to file
    }
}
