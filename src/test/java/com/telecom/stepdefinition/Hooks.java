package com.telecom.stepdefinition;

import com.telecom.resources.Commonaction;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonaction{
	
	
	@Before
	public void beforeScenario() {
		
		System.out.println("Before Scenario");
        launch("http://www.demo.guru99.com/telecom/");	

	}
	
	
	@After
	public void afterScenario() {
		
		System.out.println("After Scenario");
		driver.quit();

	}
	

}
