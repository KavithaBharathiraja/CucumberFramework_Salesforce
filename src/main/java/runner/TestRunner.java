package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/features/", glue = "stepdefinitions", tags = "@regression",
plugin = {"pretty","html:target/cucumeberReports.html"}, monochrome = true, dryRun = false)
public class TestRunner {

}
