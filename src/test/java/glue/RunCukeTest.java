package glue;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "glue",
		plugin = { 
				"pretty",
				"html:target/cucumber",
		}, 
		format={"json:target/Destination/cucumber.json"}

		)
public class RunCukeTest {
}

