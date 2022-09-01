package stepdefs;

import com.qa.ubi.pageObjects.HeaderPageObject;

import io.cucumber.java.en.And;

public class HeaderTestStepDefs {
    
	HeaderPageObject header = new HeaderPageObject();
	
	@And("^my header is displayed$")
	public void enterUsername() throws Throwable {
		header.verifyHeaderDisplayed();
	}
}
