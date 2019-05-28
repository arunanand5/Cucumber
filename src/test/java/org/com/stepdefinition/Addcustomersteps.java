package org.com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Addcustomersteps {
	static WebDriver driver;
	@Given("The user is in telecom home page")
	public void the_user_is_in_telecom_home_page() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNANAND\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.get("http://demo.guru99.com/telecom/");
	   
	}

	@Given("The user click on add customer")
	public void the_user_click_on_add_customer() {
		
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	   
	}

	@When("The user is filling all the details")
	public void the_user_is_filling_all_the_details() {
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Arun");
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Anand");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("arunanand.arun@gmail.com");
	    driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Nungambakkam");
	    driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("9944884924");   
	    
	    
	}

	@When("The user click on submit button")
	public void the_user_click_on_submit_button() {
	    
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	}

	
	@Then("The user should be displayed the customer id")
	public void the_user_should_be_displayed_the_customer_id() {
	    
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		
	}

	

}
