package RunnerUtils;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue={"stepdefinitions"})
public class TestRunner {
	
	
	

}
