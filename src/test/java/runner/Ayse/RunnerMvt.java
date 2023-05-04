package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features/Ayse/Anasayfa_.feature"},
        glue = {"stepdefs"},
        //tags = "@GirişYap",         // @login tagli senaryolar calistirilin
        plugin = {"pretty",
                "html:test-output/report.html",
                "json:test-output/report.json"
        }
)
public class RunnerMvt extends AbstractTestNGCucumberTests {
}
