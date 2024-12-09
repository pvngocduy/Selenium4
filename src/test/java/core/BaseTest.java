package core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import ultilities.ConstantGlobal;

import static Factory.DriverFactoryManager.createDriver;
import static Factory.DriverFactoryManager.quitDriver;
public class BaseTest {
    protected WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setup(@Optional("CHROME") String browser) {
        driver = createDriver(browser);
        driver.get(ConstantGlobal.WEBSITE);
    }
    @AfterTest
    public void teardown() {
        quitDriver();
    }
}
