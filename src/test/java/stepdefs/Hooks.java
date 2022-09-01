package stepdefs;

import java.io.IOException;

import com.qa.ubi.environment.BaseTest;
import com.qa.ubi.logger.Log;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks implements BaseTest {

    @After()
    public void afterScenario(Scenario scenario) throws IOException {

        if (scenario.isFailed()) {
            Log.ERROR("Scenario: " + scenario.getName() + " failed");
        } else {
            Log.INFO("Scenario: " + scenario.getName() + " passed");
        }

        browser.attachSnapshotToReport();
        browser.closeDriver();
    }

	@Before()
	public void beforeScenario(Scenario scenario) throws IOException {	    
		Log.INFO("Scenario: " + scenario.getName() + " started");
		browser.printDesktopConfiguration();
	}
}
