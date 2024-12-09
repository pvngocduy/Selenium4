package pageObject;

import core.BasePage;
import interfaces.HomePageUI;
import interfaces.LoginPageUI;
import org.openqa.selenium.WebDriver;
import ultilities.ConstantGlobal;

public class LoginPage extends BasePage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void inputUserId(){
        sendKeyToElement(driver, LoginPageUI.USER_ID_INPUT, ConstantGlobal.USER_ID);
    }
    public void inputPassword(){
        sendKeyToElement(driver,LoginPageUI.PASSWORD_ID_INPUT, ConstantGlobal.PASSWORD);
    }
    public void clickToLogin(){
        clickToElement(driver,LoginPageUI.LOGIN_BTN);
    }
}
