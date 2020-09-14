package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterSuite;
import utilities.BaseDriver;

@CucumberOptions(
        plugin = {"html:target/cucumber-report"},
        features = {"src/test/java/featureFiles/Budget.feature",
                "src/test/java/featureFiles/Country.feature",
                "src/test/java/featureFiles/Education.feature",
                "src/test/java/featureFiles/HR.feature",
                "src/test/java/featureFiles/HRSalary.feature",
                "src/test/java/featureFiles/Report.feature"
        },
        glue = {"steps"},
        dryRun = false
)

public class AllFeaturesRunner extends AbstractTestNGCucumberTests {
    @AfterSuite
    public void quitDriver() {
        BaseDriver.quitDriver();
    }
}
