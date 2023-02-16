package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features/Hotel.feature",
				 glue="StepDefinitions")
public class TestNgRunner extends AbstractTestNGCucumberTests{


}
