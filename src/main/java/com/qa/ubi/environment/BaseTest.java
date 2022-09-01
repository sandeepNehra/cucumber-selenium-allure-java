package com.qa.ubi.environment;

import com.qa.ubi.methods.BrowserUtils;
import com.qa.ubi.methods.PropertiesManagementMethods;

public interface BaseTest {
	PropertiesManagementMethods props = new PropertiesManagementMethods();
	BrowserUtils browser = new BrowserUtils();
}
