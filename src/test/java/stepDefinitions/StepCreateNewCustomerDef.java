package stepDefinitions;

import Factory.DriverFactoryManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import steps.CustomerFlowStep;

public class StepCreateNewCustomerDef {
    WebDriver driver = DriverFactoryManager.getDriver();
    CustomerFlowStep customerFlowStep = new CustomerFlowStep(driver);
    @Given("User open website bank guru99 and register mail")
    public void openWebsiteAndRegisterAccount(){
        customerFlowStep.stepRegisterEmail();
    }
    @When("User log in with username and and password provided by system")
    public void loginToSystem(){
        customerFlowStep.stepLoginToSystem();
    }
    @And("User navigate to the New Customer page and fill customer info to create new customer")
    public void createNewUser() throws InterruptedException {
        customerFlowStep.stepCreateCustomerInfo();
    }
    @And("User verify the success message and customer details displayed match the input data")
    public void verifyCreateNewUserSuccess(){

    }
}
