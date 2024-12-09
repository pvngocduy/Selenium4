package testcase;

import core.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.CustomerFlowStep;

public class TestCaseRegister extends BaseTest {
    CustomerFlowStep customerFlowStep;

    @BeforeClass
    public void beforeClass(){
        customerFlowStep = new CustomerFlowStep(driver);
    }
    // Đăng ký với empty data
    @Test
    public void TC000_RegisterEmail(){
        customerFlowStep.stepRegisterEmail();
    }
    @Test
    public void TC002_CreateNewUser() throws InterruptedException {
        customerFlowStep.stepLoginToSystem();
        customerFlowStep.stepCreateCustomerInfo();
    }
}
