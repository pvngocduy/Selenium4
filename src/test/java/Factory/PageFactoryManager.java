package Factory;

import org.openqa.selenium.WebDriver;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.NewCustomerPage;

public class PageFactoryManager {
    public static HomePage getHomePageObject(WebDriver driver){
        return new HomePage(driver);
    }
    public static LoginPage getLoginPage(WebDriver driver){
        return new LoginPage(driver);
    }
    public static NewCustomerPage getNewCustomPageObject(WebDriver driver){
        return new NewCustomerPage(driver);
    }

}
