package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resource/Features/test.feature",
		glue={"StepDefinition"},monochrome=true,
		plugin= {"pretty","httml:target/HtmlReports.html","json:target/JSONReports.xml"}
		)

public class Testrunner extends AbstractTestNGCucumberTests {

}
