package com.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber_automation.Baseclasskalai;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\automationfeature\\Automation.feature",
					glue="com.sd",
					plugin= {"html:Cucumber_report/report",
						"json:Cucumber_report/reports.json",
							"com.cucumber.listener.ExtentCucumberFormatter:Cucumber_report/Extent_report.html"
							
					}
					)
		  		

public class Test_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static  void set_up() {
		driver=Baseclasskalai.browser_configuration("chrome");

	}
	

@AfterClass
public static  void tear() {
driver.close();

}
}
