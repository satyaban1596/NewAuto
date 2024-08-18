package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature",glue={"StepDefination","Helper"}, tags="@Reg",
plugin="html:target/testReport/Test.html")

public class TestRunner {

}
