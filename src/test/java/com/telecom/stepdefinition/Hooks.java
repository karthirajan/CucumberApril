package com.telecom.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.telecom.resources.Commonaction;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonaction{
	
	
	@Before
	public void beforeScenario() {
		
		System.out.println("Before Scenario");
        launch("http://www.demo.guru99.com/telecom/");	

	}
	
	
	@After
	public void afterScenario(Scenario scenario) {
		
		if(scenario.isFailed()){
			
          final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			
			scenario.embed(screenshot, "image/png");
			
		}else{
			
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
			
		}
		
		
		System.out.println("After Scenario");
		driver.quit();

	}
	

}
