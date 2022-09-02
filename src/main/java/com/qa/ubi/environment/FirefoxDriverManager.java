package com.qa.ubi.environment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.qa.ubi.logger.Log;

public class FirefoxDriverManager extends DriverManager {
	
	URL wd_url = null;

	@Override
	public void createDriver(String webdriverHubURL) {
		DesiredCapabilities cap = DesiredCapabilities.firefox();
        // adding capabilities to the firefox browser
        cap.setCapability("acceptInsecureCerts",true);
        cap.setBrowserName("firefox");
        cap.setPlatform(Platform.WINDOWS);
        
        try {
			wd_url = new URL(webdriverHubURL);
		} catch (MalformedURLException e) {
			Log.ERROR("Unable to create URL from webdriver hub parameter" + e.getMessage());
		}
        
        driver = new RemoteWebDriver(wd_url, cap);
	}
}
