# Run automation
- Goto root (cd Selenium-cucumber-allure-reports-java)
- Run mvn clean to delete /target content folder
- Run mvn clean test  "-Dbrowser=chrome" "-Denv=testEnv" "-Dcucumber.options=-plugin io.qameta.allure.cucumberjvm.AllureCucumberJvm" to run the tests

- Browser params to pass:  
-- firefox
-- chrome
-- ie
-- safari