public class Account {
    //parent class of different type of user
    private String userName, password, recoveryQuestion, recoveryQuestionAnswer;
    private int id;
    protected void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public String getRecoveryQuestion() {
        return recoveryQuestion;
    }
    public String getUserName() {
        return userName;
    }
    public String getRecoveryQuestionAnswer() {
        return recoveryQuestionAnswer;
    }
    public void setRecoveryQuestion(String recoveryQuestion) {
        this.recoveryQuestion = recoveryQuestion;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setRecoveryQuestionAnswer(String recoveryQuestionAnswer) {
        this.recoveryQuestionAnswer = recoveryQuestionAnswer;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
