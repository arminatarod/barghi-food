import java.util.ArrayList;

public class Account {
    private String username, password, recoveryQuestion, recoveryQuestionAnswer;
    private int id;
    public Account(String username, String password, String recoveryQuestion, String recoveryQuestionAnswer, int id) {
        this.username = username;
        this.password = password;
        this.recoveryQuestion = recoveryQuestion;
        this.recoveryQuestionAnswer = recoveryQuestionAnswer;
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
    public String getUsername() {
        return username;
    }
    public String getRecoveryQuestionAnswer() {
        return recoveryQuestionAnswer;
    }
    public boolean checkPassword(String password) {
        return password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
    }
}
