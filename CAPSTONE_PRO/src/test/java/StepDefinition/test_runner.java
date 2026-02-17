package StepDefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			features="src/test/resource/Feature/sigup.feature",
			glue={"StepDefinition"},monochrome=true,
			plugin= {"pretty","httml:target/HtmlReports.html","json:target/JSONReports.xml"}
			)

	public class test_runner extends AbstractTestNGCucumberTests {

	}



