import org.junit.Before;
import org.junit.Test;


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
}