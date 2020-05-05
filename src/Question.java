public class Question {


    String question ;
    int answer;
    String surveyName ;



    public Question(String surveyName, String question) {
        this.question = question;
        this.surveyName= surveyName;
    }


    public String getQuestion() {
        return question;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
