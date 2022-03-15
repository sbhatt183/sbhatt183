package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"@rerun/failed.txt"},
				glue= {"stepdefination"},
				plugin= {})
public class FailedTestrunner {

}
