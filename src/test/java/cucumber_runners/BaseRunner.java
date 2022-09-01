package cucumber_runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.qa.ubi.utilities.reports.AllureReportConfigurationSetup;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * Runner to execute casino tests
 * 
 * command line usage:
 * 
 * mvn clean -q -U install -Dtest=BasetRunner -DfailIfNoTests=false
 * -Denv=ENVIRONMENT -Ddevice=DEVICE -Dcucumber.options= "--tags @TAG_NAME"
 * 
 * @author Sandeep Nehra
 *
 */

@CucumberOptions(plugin = { "pretty",

		"html:target/cucumber/cucumber-html-report",

		"json:target/cucumber/cucumber-json-report.json"

}, dryRun = false, monochrome = true,

		features = "src/test/resources/features", glue = { "stepdefs" })
@RunWith(Cucumber.class)
public class BaseRunner {


@BeforeClass()
public static void runTomcat() throws Exception {

	// prepare reports folder
	AllureReportConfigurationSetup.prepareAllureResultsFolder();
}
}