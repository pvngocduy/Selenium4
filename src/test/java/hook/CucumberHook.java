package hook;

import Factory.DriverFactoryManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import ultilities.ConstantGlobal;

import static Factory.DriverFactoryManager.createDriver;
import static Factory.DriverFactoryManager.quitDriver;

public class CucumberHook {
    protected WebDriver driver;
    @Before
    public void beforeScenario(){
        driver = DriverFactoryManager.getDriver();
        driver.get(ConstantGlobal.WEBSITE);
    }

    @After
    public void teardown() {
        quitDriver();
    }
}
