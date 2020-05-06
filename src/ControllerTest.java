import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class ControllerTest {

    private Controller controller;

    @Before
    public void setUp() throws Exception {
        controller = new Controller();
    }

    @Test
    public void createSurvey() {
        controller.createSurvey("Evaluation");
    }

    @Test
    public void addQuestionToSurvey() {
        controller.addQuestionToSurvey("Evaluation", "How much are you satisfied about our services?");
        controller.addQuestionToSurvey("Room service evaluation", "How much are you satisfied about our cleaning services?");
    }


    @Test
    public void createSurveyResponse() {
        ArrayList<Question> questions = new ArrayList<>();
        Question q1 = new Question("Evaluation", "How much are you satisfied about our services?");
        q1.setAnswer(2);
        questions.add(q1);

        controller.createSurveyResponse(questions, "Evaluation");
    }

    @Test
    public void getSurveys(){
        ArrayList<Survey> surveys = controller.getSurveys();
        for(Survey s: surveys){
            System.out.println(s.getName());
        }

    }

    @Test
    public void getSpecificSurveys(){
        Survey survey = controller.getSpecificSurvey("Evaluation");
        if(survey != null)
            System.out.println(survey.getName());
    }

    @Test
    public void surveyCalculationSummary(){
        int min = controller.surveyMinRate("Evaluation");
        int avg = controller.surveyAverageRate("Evaluation");
        int max = controller.maxSurveyRate("Evaluation");
        int standardDivation = controller.calcStandardDeviation("Evaluation");

        System.out.println("minimum rate: " + min);
        System.out.println("maximum rate: " + max);
        System.out.println("average rate: " + avg);
        System.out.println("standard divation: " + standardDivation);
    }
}