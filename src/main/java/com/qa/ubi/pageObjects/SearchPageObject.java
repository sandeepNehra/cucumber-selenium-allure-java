package com.qa.ubi.pageObjects;

import static com.qa.ubi.methods.SelectorType.CSS;

import com.qa.ubi.environment.BaseTest;
import com.qa.ubi.logger.Log;
import com.qa.ubi.methods.TestCaseFailed;

/**
 * Search
 * 
 * @author Sandeep Nehra
 *
 */

public class SearchPageObject implements BaseTest {
    
    // elements
    String searchFormCSS = "div.searching";

    public void verifySearchDisplayed() throws TestCaseFailed {
        Log.INFO("Verify search is displayed");
        browser.checkElementPresence(CSS, searchFormCSS);
    }

    public void enterSearchText(String searchText) throws TestCaseFailed {
        Log.INFO("Enter search text: "+searchText);
        browser.click(CSS, searchFormCSS);
        browser.enterTextByActions(CSS, searchText, searchFormCSS);
    }
}
