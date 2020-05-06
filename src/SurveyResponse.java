import java.util.ArrayList;

public class SurveyResponse {

    String surveyName;
    ArrayList<Question> questions;

    public SurveyResponse(String surveyName, ArrayList<Question> questions) {

        this.surveyName = surveyName;
        this.questions = questions;
    }



    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
