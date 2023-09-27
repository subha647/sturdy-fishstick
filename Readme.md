# Procedure to run the test case

- Extract Subhakanta.zip
- Go to `/PeopleGrove/src/test/java/steps/verifySendMessage.java`
- Change line no 42 with a diferent role, if considering same user 
    ```
    this.position = "QA"
    ```
- Or pass new user credential to line no 40, 41

    ```
    this.email = "new_user@domain";
    this.password = "new_password";
    ```
- Run the project as JUnit test, or run the test runner `/PeopleGrove/src/test/java/TestRunner/testRunner.java`
- It will generate the report `/PeopleGrove/report1.html`, open in browser to check.

# Overview on floder structure

- `/PeopleGrove/Features/verifySendMessage.feature` feature file contains the steps to test the first test case
- `/PeopleGrove/src/test/java/steps/verifySendMessage.java` step definition file contains the steps written in feature file
- `/PeopleGrove/src/test/java/steps/commonSteps.java` contains the web driver, and before and after method
- `/PeopleGrove/src/test/java/Element_Repo/helper_element.java` element repository contains all the web elements
- `/PeopleGrove/src/test/java/TestRunner/testRunner.java` is the test runner which run the test case and generate the report1 