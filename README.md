# survey-system

## Scrum backlog and task estimation

### Sprint backlog
| task                                                                                                  | Estimation(hour) | priority |
|-------------------------------------------------------------------------------------------------------|------------------|----------|
| As a manager, I want to create a survey of question.                                                  | 3                | 1        |
| As a customer, I want to fill a survey response.                                                      | 3                | 2        |
| As a manager, I want to get a list of the created surveys.                                            | 1                | 3        |
| As a manager, I want to search for a survey by its name.                                              | 1.5              | 4        |
| As a manager, I want to get a summary calculation of a specific survey answers (avg, min, max).       | 2                | 5        |
| As a manager, I want to get a summary calculation of a specific question of a survey (avg, min, max). | 2                | 6        |

The estimation of tasks was based on the effort of applying the feature of each task, 
so the time might vary from task to another due to thier difficulty. As a comparason, the task of creating a survey takes triple time of the task of getting the created tasks, due to the size effort and lines of code for each.

### Velocity metric
The most important measure that an Agile team will use in planning is its “Velocity”. It is the amount of work finished by the team in each sprint. It helps the team to identify how much progress they can aim to make in a given sprint. Velocity is calculated by adding all the story points given to each user story that is completed by the end of the sprint. It measures output, but not the outcome.

The steps involved in Velocity-based Sprint Planning are as follows:
* Calculate the team’s average velocity (from last 3 Sprints)
* Select the items from the product backlog equal to the average velocity
* Verify whether the tasks associated with the selected user stories are appropriate for the particular sprint
* Estimate the tasks and check if the total work is consistent with past sprints

## Unit tesing and Test-Driven development
each commit in the branches has a test method/s, which means that each commitis tested and the next commit content is not written before testing the previous code.
taking 'add-question' commit as an example, Controller class has the method of adding a question into a survey, and the class of ControllerTest applies the JUnit test of the method.

## Test coverage metric
the used tool was ' JUnit Test Case in Eclipse', link to the sreenshot of applying the tool (https://github.com/Rubaalmashhuri/survey-system/blob/master/CodeCoverage.png)

## Team version-control
The process that were followed for version control was GitFlow, there was two local branches (master and develop),
a feature branches have been created of the develop branh.

### Feature branches were:
* create-survey
* add-question
* create-response
* get-specific-survey
* get-surveys-list
* survey-calculatinon
* survey-question-calculation

each feature brance were merged to develop and published on the remote repo, and the released code were merged to branch master..

## Code-review checklist
* Don't Repeat Yourself (Avoid Duplication) 
  in the methods surveyMaxRate and min and average you need to extraxt  method with the duplicated code
* You need to set private property to initaized varaible in Survey, Question and SurveyResponse classes
* Remove unused variable "int average = 0" in Controller class surveyAverageRate method
* Explain yourself in code: you need to add comments to have a understandable code
* Always override toString 


  

