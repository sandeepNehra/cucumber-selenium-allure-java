package com.qa.ubi.environment;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;
    protected abstract void createDriver(String webdriverHubURL);

    public void quitDriver() { 	
        if (driver!=null) {
            driver.quit();
            driver = null;
        }

    }

    public WebDriver getDriver(String webdriverHubURL) {
        if (driver == null) {
            createDriver(webdriverHubURL);
        }
        return driver;
    }
}