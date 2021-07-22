package PerfectFramework.stepDefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import PerfectFramework.utils.BrowserUtils;
import PerfectFramework.utils.ConfigurationsReader;
import PerfectFramework.utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks extends BrowserUtils {
    @Before
    public void setup(){
        Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(ConfigurationsReader.getProperties("url"));
    }
    @After
    public void lastStep(Scenario scenario) {

        if(scenario.isFailed()){
            byte[] data=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data,"image/png",scenario.getName());
        }
        Driver.tearDown();
        System.out.println("end of execution");
    }
}
