# BDD Test Automation Framework

Automation Testing Using Selenium, BDD and Allure reports

Automation base is a behavior driven development (BDD) approach to write automation test script to test Web.  
The framework supports reporting with Allure reports

Getting Started
-------------
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

Prerequisites
--------------
Maven  
Git

Installing
-------------
Clone the repo to get a working project


Running the tests - command line mode
-------------------
cd to project path  

mvn test -Dbrowser=chrome -Denv=testEnv -Dtest=BaseRunner "-Dcucumber.options=--plugin io.qameta.allure.cucumberjvm.AllureCucumberJvm"

Running the tests - from IDE  
-------------------
Run [src/test/java/cucumber_runners/BaseRunner.java](src/test/java/cucumber_runners/BaseRunner.java)  as maven test


Documentation
-------------
* [Installation](doc/installation.md)
* [Run tests](doc/run_tests.md)
* [Pass external parameters to test](doc/working_with_parameters.md)
* [Use allure reports](doc/allure_reports.md)
* [Use predefined steps](doc/canned_steps.md)
* [Webdriver types support](doc/working_with_webdrivers.md)
* [Mobile emulation](doc/mobile_emulation.md)

Built With
-------------
* [Selenium](http://www.seleniumhq.org/) - The web framework to automate browsers
* [Maven](https://maven.apache.org/) - Dependency Management
* [Cucumber](https://cucumber.io/) - Behavior Driven Development (BDD) library 
* [Allure reports](http://allure.qatools.ru/) - Reporting 

Contributing
-------------
This section will be updated once the framework is ready.

Authors
-------------
**Sandeep Nehra**  - Email: nehrasandeep4@gmail.com

License
-------------
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
