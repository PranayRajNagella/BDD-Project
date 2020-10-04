package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepdefinitions {
	

	//public static CommonStepDefinitions cm=new CommonStepDefinitions();
	
	
	 WebDriver driver=CommonStepDefinitions.driver;
	
	@Then("i should be able to land in Home Page {string}")
	public void i_should_be_able_to_land_in_Home_Page(String string) {
		System.out.println("Iam of the landing page"+string);
		driver.close();
		
	}
	

	@Given("i go {string}")
	public void i_go(String url) {
		driver.get(url);
	}




}
