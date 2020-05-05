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
}