public class Comment {
    private int id;
    private String content, answer;
    private Account commenter;

    public int getId() {
        return id;
    }
    public Account getCommenter() {
        return commenter;
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
    public void setCommenter(Account commenter) {
        this.commenter = commenter;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public void setContent(String commentText) {
        this.content = commentText;
    }
}
