package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            features = "src/test/java/features",     // lokasi feature file
            glue = {"stepdefinition"},                       // lokasi step definition
            plugin = {"pretty", "html:target/cucumber-report.html"}
    )
    public class ScenarioTestFinal extends AbstractTestNGCucumberTests {
    }


