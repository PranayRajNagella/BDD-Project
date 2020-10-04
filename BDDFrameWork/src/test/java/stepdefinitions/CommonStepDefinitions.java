package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonStepDefinitions {
	
	static WebDriver driver;
	
	@Given("^when i Open the Browser$")
	public void when_i_Open_the_Browser() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Resources//chromedriver.exe");
		 driver=new ChromeDriver();
	//	driver.get("https://www.flipkart.com/");
		
	}

	@When("i enter {string}")
	public void i_enter(String string) {
		
	System.out.println("Eneterd password");
	  
	}

	@When("i click and Submit")
	public void i_click_and_Submit() {
		System.out.println("Password password");
		  
	}


}
