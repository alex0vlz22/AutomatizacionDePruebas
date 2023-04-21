package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/carrito.feature",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber"})
public class Runner2 extends AbstractTestNGCucumberTests {

}
