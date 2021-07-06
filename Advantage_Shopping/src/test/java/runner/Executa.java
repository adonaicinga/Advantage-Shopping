package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = "tests",
		tags = "@test",
		plugin = {"pretty", "html:target/relatorio.html"},
		monochrome = true,
		dryRun = false
		)

public class Executa {
		
	

}