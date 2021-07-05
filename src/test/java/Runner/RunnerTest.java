package Runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Scenario/",
        glue = {"StepDefinitions"},
        tags = {"@loginWithParameter"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/Instagram-report/InstagramAutomationTest.html","json:target/instagram-page/instagram.json"},
        dryRun = false,
        monochrome = true
)
public class RunnerTest {
    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig("src/main/resources/extent-config.xml");
        Reporter.setSystemInfo("Author ","Claudia Lukita Dewi");
        Reporter.setSystemInfo("Time Zone ", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine ", 	"Windows 10 " + " 64 Bit");
        Reporter.setSystemInfo("CUCUMBER SELENIUM : ", "Simple Automation Test Example");
    }
}