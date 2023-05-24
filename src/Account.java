import java.util.ArrayList;

public class Account {
    //parent class of different type of user
    private String userName, password, recoveryQuestion, recoveryQuestionAnswer;
    private ArrayList<String> username = new ArrayList<>();
    private int id;

    public Account(String userName, String password, String recoveryQuestion, String recoveryQuestionAnswer, int id) {
        this.userName = userName;
        this.password = password;
        this.recoveryQuestion = recoveryQuestion;
        this.recoveryQuestionAnswer = recoveryQuestionAnswer;
        this.id = id;
    }

    /*protected void setId(int id) {
        this.id = id;
    }*/
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

    public ArrayList<String> getUsername() { return username; }

    //ye tabe vase chek krdn password ba regex
    public boolean chekPassword(String password)
    {
        return password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
    }
    //tabe vase yekta budn username
    public boolean chekUserName(String userName)
    {
        return username.contains(userName) ? false : true;
    }
    //ina ke comment krdm ba ye constructor jaygozin shodn
   /* public void setRecoveryQuestion(String recoveryQuestion) {
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
    }*/

}
