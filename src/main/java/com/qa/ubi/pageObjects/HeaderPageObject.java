package com.qa.ubi.pageObjects;

import static com.qa.ubi.methods.SelectorType.CSS;

import com.qa.ubi.environment.BaseTest;
import com.qa.ubi.logger.Log;
import com.qa.ubi.methods.TestCaseFailed;

/**
 * Header POC
 * 
 * @author Sandeep Nehra
 *
 */

public class HeaderPageObject implements BaseTest {
    
    // elements
    String headerCss = "div.header";

    public void verifyHeaderDisplayed() throws TestCaseFailed {
        Log.INFO("Verify header is displayed");
        browser.checkElementPresence(CSS, headerCss);
    }
}
