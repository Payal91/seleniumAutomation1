package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BankLoginPage;
import pages.BankTransferPage;
import pages.HomePage;

import java.time.Duration;

public class BankTransferTest extends TestBaseTransfer {

    @BeforeTest
    public void logIn() {
        BankLoginPage loginPage = PageFactory.initElements(driver, BankLoginPage.class);
        loginPage.setEmail("johnTest1");
        loginPage.setPasswordTextBox("demo");
        loginPage.clickOnLoginIn();
    }

    //driver.get("https://parabank.parasoft.com/parabank/transfer.htm")
    @Test
    public void testTransfer() {
        BankTransferPage transferPage = PageFactory.initElements(driver, BankTransferPage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        transferPage.clickTransferFundsLink();
        transferPage.setAmountTextBox("66");
        transferPage.selectFromAccount();
        //driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Out")));
        transferPage.selectToAccount();
        transferPage.clickTransferLink();
    }

    @AfterTest
    public void logOut() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickLogOut();
    }

}