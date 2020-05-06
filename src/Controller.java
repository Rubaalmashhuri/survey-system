import java.util.ArrayList;
import java.util.Arrays;

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

    public ArrayList<Survey> getSurveys(){
        return surveys;
    }

    public Survey getSpecificSurvey(String surveyName){
        for (Survey survey: surveys
        ) {
            if (survey.getName().equalsIgnoreCase(surveyName))
                return survey;
        }
        return null;
    }

    public void createSurveyResponse(ArrayList<Question> questions , String surveyName) {
        SurveyResponse response = new SurveyResponse( surveyName,questions );
        for (Survey survey: surveys
        ) {
            if (survey.getName().equalsIgnoreCase(surveyName)){
                ArrayList<SurveyResponse> responses = survey.getSurveyResponses();
                responses.add(response);
                survey.setSurveyResponses(responses);
            }
        }
    }

    int count_1 = 0 ;
    int count_2 = 0 ;
    int count_3 = 0 ;
    int count_4 = 0 ;
    int count_5 = 0 ;

    public int maxSurveyRate(String surveyName){
        count_1 = 0 ;
        count_2 = 0 ;
        count_3 = 0 ;
        count_4 = 0 ;
        count_5 = 0 ;
        int max = 0;
        for (Survey survey : surveys){
            if (survey.getName().equalsIgnoreCase(surveyName)){
                for (SurveyResponse response : survey.getSurveyResponses()){
                    for (Question question : response.questions){
                        switch (question.getAnswer()){
                            case 1:count_1++;
                                break;
                            case 2:count_2++;
                                break;
                            case 3:count_3++;
                                break;
                            case 4:count_4++;
                                break;
                            case 5:count_5++;
                                break;

                        }
                    }
                }
            }

        }

        int [] counters = {count_1 , count_2 ,count_3 , count_4,count_5};
        max = 1;
        for (int i = 1 ; i<counters.length ; i++){
            if (counters[i] > counters[i-1])
                max = i+1;
        }

        return  max;
    }

    public int surveyMinRate(String surveyName){
        count_1 = 0 ;
        count_2 = 0 ;
        count_3 = 0 ;
        count_4 = 0 ;
        count_5 = 0 ;
        int min = 0;
        for (Survey survey : surveys){
            if (survey.getName().equalsIgnoreCase(surveyName)){
                for (SurveyResponse response : survey.getSurveyResponses()){
                    for (Question question : response.questions){
                        switch (question.getAnswer()){
                            case 1:count_1++;
                                break;
                            case 2:count_2++;
                                break;
                            case 3:count_3++;
                                break;
                            case 4:count_4++;
                                break;
                            case 5:count_5++;
                                break;

                        }
                    }
                }
            }

        }


        int [] counters = {count_1 , count_2 ,count_3 , count_4,count_5};
        min = counters[0];
        for (int i = 1 ; i<counters.length ; i++){
            if (counters[i] <= counters[i-1])
                min = i+1;
        }
        return min;
    }



    public int surveyAverageRate(String surveyName){
        count_1 = 0 ;
        count_2 = 0 ;
        count_3 = 0 ;
        count_4 = 0 ;
        count_5 = 0 ;
        for (Survey survey : surveys){
            if (survey.getName().equalsIgnoreCase(surveyName)){
                for (SurveyResponse response : survey.getSurveyResponses()){
                    for (Question question : response.questions){
                        switch (question.getAnswer()){
                            case 1:count_1++;
                                break;
                            case 2:count_2++;
                                break;
                            case 3:count_3++;
                                break;
                            case 4:count_4++;
                                break;
                            case 5:count_5++;
                                break;

                        }
                    }
                }
            }
        }


        int [] counters = {count_1 , count_2 ,count_3 , count_4,count_5};
        count_1 = counters[0];
        count_2 = counters[1];
        count_3 = counters[2];
        count_4 = counters[3];
        count_5 = counters[4];

        Arrays.sort(counters);

        if (counters[2] == count_1){
            return 1;
        }else  if (counters[2] == count_2){
            return 2;
        }else  if (counters[2] == count_3){
            return 3;
        }else  if (counters[2] == count_4){
            return 4;
        }else
            return 5;

    }

    public int calcStandardDeviation(String surveyName){
        int mean = surveyAverageRate(surveyName);
        int sum =0;

        for (Survey survey : surveys){
            if (survey.getName().equalsIgnoreCase(surveyName)){
                for (SurveyResponse response : survey.getSurveyResponses()){
                    for (Question question : response.questions){
                        switch (question.getAnswer()){
                            case 1:count_1++;
                                break;
                            case 2:count_2++;
                                break;
                            case 3:count_3++;
                                break;
                            case 4:count_4++;
                                break;
                            case 5:count_5++;
                                break;

                        }
                    }
                }
            }

        }


        int [] counters = {count_1 , count_2 ,count_3 , count_4,count_5};
        for(int i = 0 ; i <counters.length-1 ; i++){
            sum +=((counters[i] - mean) * (counters[i] - mean));
        }


        return  (int)Math.sqrt((float) sum /counters.length);

    }
}
