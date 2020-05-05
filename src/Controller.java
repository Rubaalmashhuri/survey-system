import java.util.ArrayList;

public class Controller {
    ArrayList<Survey> surveys = new ArrayList<>();

    public void createSurvey(String surveyName){
        Survey survey = new Survey(surveyName);
        surveys.add(survey);
        System.out.println(surveyName +" survey, has been created..");
    }
}
