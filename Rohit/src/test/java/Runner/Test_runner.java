package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Login/Login.feature"}, 
	glue = {"stepslogin"},
	tags = "@login",
	dryRun = false,
	monochrome=true,
	plugin = {"html:testoutput/testoutput.html","junit:junit.xml/cucumber.xml","json:json_output/cucumber.json"} )

public class Test_runner {

}
