package pageObject;

import core.BasePage;
import interfaces.NewCustomerPageUI;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage extends BasePage {
    private WebDriver driver;

    public NewCustomerPage(WebDriver driver) {
        this.driver = driver;
    }
    public void inputCustomerName(String name) {
        sendKeyToElement(driver, NewCustomerPageUI.NAME_INPUT, name);
    }

    public void selectGender(String name) {
        if (name.equalsIgnoreCase("MALE")) {
            clickToElement(driver, NewCustomerPageUI.GENDER_MALE_BTN);
        } else {
            clickToElement(driver, NewCustomerPageUI.GENDER_FEMALE_BTN);
        }
    }

    public void selectDateOfBirth(String date) {
        sendKeyToElement(driver, NewCustomerPageUI.DATE_PICKER, date);
    }

    public void inputCustomerAddress(String address) {
        sendKeyToElement(driver, NewCustomerPageUI.ADDRESS_INPUT, address);
    }
    public void inputCustomerCity(String city) {
        sendKeyToElement(driver, NewCustomerPageUI.CITY_INPUT, city);
    }
    public void inputCustomerState(String state) {
        sendKeyToElement(driver, NewCustomerPageUI.STATE_INPUT, state);
    }
    public void inputCustomerPin(String pin) {
        sendKeyToElement(driver, NewCustomerPageUI.PIN_INPUT, pin);
    }
    public void inputCustomerPhoneNumber(String phone) {
        sendKeyToElement(driver, NewCustomerPageUI.PHONE_INPUT, phone);
    }
    public void inputCustomerEmail(String email) {
        sendKeyToElement(driver, NewCustomerPageUI.EMAIL_INPUT, email);
    }
    public void clickToSubmit() throws InterruptedException {
        clickToElement(driver, NewCustomerPageUI.SUBMIT_BTN);
        Thread.sleep(15000);
    }
}