package steps;

import Factory.PageFactoryManager;
import core.BaseTest;
import helpers.DataFakerHelpers;
import model.Customer;
import org.openqa.selenium.WebDriver;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.NewCustomerPage;
import ultilities.JsonReader;

public class CustomerFlowStep extends BaseTest {
    public HomePage homePage;
    public LoginPage loginPage;
    public NewCustomerPage newCustomerPage;
    Customer customerData = JsonReader.readJsonFile("src/test/java/testdata/create_customer.json", Customer.class);
    public CustomerFlowStep(WebDriver driver){
        homePage = PageFactoryManager.getHomePageObject(driver);
        loginPage = PageFactoryManager.getLoginPage(driver);
        newCustomerPage = PageFactoryManager.getNewCustomPageObject(driver);
    }
    public void stepRegisterEmail(){
        homePage.inputEmailRegister(DataFakerHelpers.getFaker().internet().emailAddress());
        homePage.clickToRegisterEmail();
    }
    public void stepLoginToSystem(){
        homePage.openBankProjectPage();
        loginPage.inputUserId();
        loginPage.inputPassword();
        loginPage.clickToLogin();
    }
    public void stepCreateCustomerInfo() throws InterruptedException {
        homePage.openNewCustomerPage();
        newCustomerPage.inputCustomerName(customerData.getCustomerName());
        newCustomerPage.selectGender(customerData.getGender());
        newCustomerPage.selectDateOfBirth(customerData.getDateOfBirth());
        newCustomerPage.inputCustomerAddress(customerData.getAddress());
        newCustomerPage.inputCustomerCity(customerData.getCity());
        newCustomerPage.inputCustomerState(customerData.getState());
        newCustomerPage.inputCustomerPin(customerData.getPin());
        newCustomerPage.inputCustomerPhoneNumber(customerData.getMobile());
        newCustomerPage.inputCustomerEmail(customerData.getEmail());
        newCustomerPage.clickToSubmit();
    }
}
