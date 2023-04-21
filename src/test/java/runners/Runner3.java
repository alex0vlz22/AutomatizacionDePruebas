package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/FiltroPrecio.feature",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber"})

public class Runner3 extends AbstractTestNGCucumberTests{
}
