package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/Gizem/Automation.feature"},
        glue={"stepdefs"},
        plugin = {"pretty",
                "html:test-output/report.html",
                "json:test-output/report.json"
        }


)
public class RunnerNew extends AbstractTestNGCucumberTests {

}
