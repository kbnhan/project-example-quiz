package quiz;

public class Quiz {

    private String answer = "Blue";
    private String user_answer;

    public String getAnswer() {
        return answer;
    }

    public void setUserAnswer(String input) {
        this.user_answer = input;
    }

    public String getUserAnswer() {
        return user_answer;
    }
}