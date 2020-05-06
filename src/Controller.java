import java.util.ArrayList;

public class Controller {
    ArrayList<Survey> surveys = new ArrayList<>();

    public void createSurvey(String surveyName){
        Survey survey = new Survey(surveyName);
        surveys.add(survey);
        System.out.println(surveyName +" survey, has been created..");
    }

    public void addQuestionToSurvey(String surveyName, String questionTxt){
        boolean isAdded = false;
        for (Survey survey:surveys
        ) {
            if (survey.getName().equalsIgnoreCase(surveyName)){
                Question question = new Question(surveyName, questionTxt);
                ArrayList<Question> questions =  survey.getQuestions();
                questions.add(question);
                survey.setQuestions(questions);
                System.out.println("Question added into survey '" + surveyName+"'");
                isAdded = true;
                break;
            }
        }
        if (!isAdded) System.out.println("The survey '"+ surveyName+ "' is not added into the list");
    }

    public void createSurveyResponse(ArrayList<Question> questions , String surveyName) {
        SurveyResponse response = new SurveyResponse( surveyName,questions );
        for (Survey survey: surveys) {
            System.out.println(survey.getName());
            if (survey.getName().equalsIgnoreCase(surveyName)){
                ArrayList<SurveyResponse> responses = survey.getSurveyResponses();
                responses.add(response);
                survey.setSurveyResponses(responses);
                System.out.println("Response added to '"+surveyName+"'");
                break;
            }
        }
    }
}
