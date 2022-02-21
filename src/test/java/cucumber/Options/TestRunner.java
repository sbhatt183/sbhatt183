package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"E:\\Projects\\cucumber\\src\\test\\java\\features"},plugin="json:target/jsonReports/cucumberReport.json",
		glue={"stepdefination"}
		)
public class TestRunner {

}
