import static org.junit.Assert.*;

public class ControllerTest {

    private Controller controller;

    @org.junit.Before
    public void setUp() throws Exception {
        controller = new Controller();
    }

    @org.junit.Test
    public void createSurvey() {
        controller.createSurvey("Evaluation");
    }
}