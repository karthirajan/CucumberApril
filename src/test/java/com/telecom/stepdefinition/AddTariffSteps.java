package com.telecom.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddTariffSteps {
	
	public static WebDriver driver;
	
	@Given("User launch telecom application")
	public void user_launch_telecom_application() {
		
		System.out.println("Scenario");
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	    
	}

	@Given("user click on add tariff button")
	public void user_click_on_add_tariff_button() {
	    
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		
	}

	@When("user enters plan details {string},{string},{string},{string},{string},{string},{string}")
	public void user_enters_plan_details(String mRental, String lmc, String imc, String string4, String string5, String string6, String string7) {
	    
		driver.findElement(By.id("rental1")).sendKeys(mRental);
		driver.findElement(By.id("local_minutes")).sendKeys(lmc);
		driver.findElement(By.id("inter_minutes")).sendKeys(imc);
		driver.findElement(By.id("sms_pack")).sendKeys(string4);
		driver.findElement(By.id("minutes_charges")).sendKeys(string5);
		driver.findElement(By.id("inter_charges")).sendKeys(string6);
		driver.findElement(By.id("sms_charges")).sendKeys(string7);
		
	}
	
	@When("user click on submit buttons")
	public void user_click_on_submit_buttons() {
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	    
	}

	@Then("user validate congrats message")
	public void user_validate_congrats_message() {
		
		Assert.assertEquals("Congratulation you add Tariff Plan", driver.findElement(By.xpath("//h2[contains(text(),'add')]")).getText());
	    
	}


}
