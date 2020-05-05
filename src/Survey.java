import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Survey {

    int currentId ;
    static AtomicInteger id = new AtomicInteger(0);
    ArrayList<Question> questions = new ArrayList<>();
    String name;

    public Survey(String name) {
        this.name = name;
        this.currentId = id.get();
        getNextCountValue();
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public int getCurrentId() {
        return currentId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getNextCountValue() {
        return id.incrementAndGet();
    }


}
