package com.qa.ubi.environment;

public class DriverManagerFactory {

	static String browserName = System.getProperty("browser", "chrome");

	public static DriverManager getManager(DriverType type) {

		DriverManager driverManager;

		switch (type) {
		case CHROME:
			driverManager = new ChromeDriverManager();
			break;
		case FIREFOX:
			driverManager = new FirefoxDriverManager();
			break;
		default:
			driverManager = new ChromeDriverManager();
			break;
		}
		return driverManager;
	}

	public static DriverManager getManagerByUserSelection() {
		DriverManager driverManager;

		switch (browserName) {
		case "chrome":
			driverManager = new ChromeDriverManager();
			break;
		case "firefox":
			driverManager = new FirefoxDriverManager();
			break;
		default:
			driverManager = new ChromeDriverManager();
			break;
		}
		return driverManager;
	}
}