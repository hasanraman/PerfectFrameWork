package PerfectFramework.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "/PerfectFramework",
        dryRun=false,  //When it is false it is inactive
        tags = "@Smoke",
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",
        }
)

public class CukesRunner {
}
