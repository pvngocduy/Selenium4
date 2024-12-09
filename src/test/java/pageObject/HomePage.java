package pageObject;

import Factory.PageFactoryManager;
import core.BasePage;
import helpers.PropertiesHelper;
import org.openqa.selenium.WebDriver;
import interfaces.HomePageUI;
import ultilities.ConstantGlobal;

public class HomePage extends BasePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void inputEmailRegister(String inputValue){
        waitForElementClickable(driver, HomePageUI.EMAIL_INPUT);
        clickToElement(driver, HomePageUI.EMAIL_INPUT);
        sendKeyToElement(driver, HomePageUI.EMAIL_INPUT, inputValue);
    }
    public void clickToRegisterEmail(){
        waitForElementClickable(driver, HomePageUI.SUBMIT_BTN);
        clickToElement(driver, HomePageUI.SUBMIT_BTN);
        System.out.println(getUserId());
        System.out.println(getPassword());
    }
    public String getUserId(){
        waitForElementVisible(driver,HomePageUI.USER_ID_TEXT);
        PropertiesHelper.setPropValue("USER_ID",getElementText(driver,HomePageUI.USER_ID_TEXT));
        return getElementText(driver,HomePageUI.USER_ID_TEXT);
    }
    public String getPassword(){
        waitForElementVisible(driver,HomePageUI.PASSWORD_TEXT);
        PropertiesHelper.setPropValue("PASSWORD",getElementText(driver,HomePageUI.PASSWORD_TEXT));
        return getElementText(driver,HomePageUI.PASSWORD_TEXT);
    }
    public NewCustomerPage openNewCustomerPage(){
        clickToElement(driver,HomePageUI.NEW_CUSTOMER_LINK);
        return PageFactoryManager.getNewCustomPageObject(driver);
    }
    public void openBankProjectPage(){
        clickToElement(driver,HomePageUI.BANK_PROJECT_LINK);
    }



}
