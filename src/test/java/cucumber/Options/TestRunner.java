package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"E:\\Projects\\cucumber\\src\\test\\java\\features\\Addplace.feature"},
		plugin={"json:target/jsonReports/cucumberReport.json","rerun:rerun/failed.txt"},
		glue={"stepdefination"}
		)
public class TestRunner {
 
}
