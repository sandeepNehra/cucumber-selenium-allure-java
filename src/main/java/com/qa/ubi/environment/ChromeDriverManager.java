package com.qa.ubi.environment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.qa.ubi.logger.Log;

public class ChromeDriverManager extends DriverManager {

	URL wd_url = null;

	@Override
	public void createDriver(String webdriverHubURL) {
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "iPhone X");

		ChromeOptions options = new ChromeOptions();

		if (getPlatform()) {
			Log.INFO("Create mobile browser");
			options.setExperimentalOption("mobileEmulation", mobileEmulation);
		}

		options.addArguments("test-type");
		options.addArguments("--start-maximized");
        options.addArguments("disable-infobars");
        options.setAcceptInsecureCerts(true);

        try {
			wd_url = new URL(webdriverHubURL);
		} catch (MalformedURLException e) {
			Log.ERROR("Unable to create URL from webdriver hub parameter" + e.getMessage());
			e.printStackTrace();
		}
		
        driver = new RemoteWebDriver(wd_url, options);
	}
    
    public boolean getPlatform() {
        return (System.getProperty("browser").contains("mobile")) ? true : false;
    }
}
