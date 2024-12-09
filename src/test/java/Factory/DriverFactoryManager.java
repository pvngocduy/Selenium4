package Factory;

import core.BrowserList;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactoryManager {
    public static WebDriver driver;

    // Private constructor để tránh khởi tạo đối tượng WebDriver từ ngoài lớp này
    private DriverFactoryManager() {}

    // Phương thức public static để lấy WebDriver
    public static WebDriver getDriver() {
        if (driver == null) {
            synchronized (DriverFactoryManager.class) {
                if (driver == null) {
                    driver = createDriver("CHROME");
                }
            }
        }
        return driver;
    }
    public static WebDriver createDriver(String browserName){
        BrowserList browser = BrowserList.valueOf(browserName.toUpperCase());
        switch (browser){
            case CHROME :
                driver = new ChromeDriver();
                break;
            case EDGE :
                driver = new EdgeDriver();
                break;
            case FIREFOX :
                driver = new FirefoxDriver();
                break;
            case SAFARI :
                driver = WebDriverManager.safaridriver().create();
                break;
            case OPERA :
                driver = WebDriverManager.operadriver().create();
                break;
            default:
                throw new RuntimeException("Pls enter the correct Browser name");
        }
        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().setSize(new Dimension(1920,1080));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
