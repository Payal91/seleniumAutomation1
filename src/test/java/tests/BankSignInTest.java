package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.BankSignInPage;
import pages.HomePage;

import java.time.Duration;
import java.util.Random;


public class BankSignInTest extends TestBaseSignIn {

    @Test
    public void testSignIn() {

//driver.get("https://parabank.parasoft.com/parabank/index.htm");
        BankSignInPage signInPage = PageFactory.initElements(driver, BankSignInPage.class);
        signInPage.clickRegisterLink();
        signInPage.setFirstNameTextBox("john");
        signInPage.setLastNameTextBox("j");
        signInPage.setAddressTextBox("abcStreet");
        signInPage.setCityTextBox("city");
        signInPage.setStateTextBox("state");
        signInPage.setZipCodeTextBox("462121");
        signInPage.setPhoneTextBox("12345678");
        signInPage.setSsnTextBox("123");
        signInPage.setUserTextBox("johnTest" + new Random().nextInt());
        signInPage.setPasswordTextBox("demo");
        signInPage.setConfirmPasswordTextBox("demo");
        signInPage.clickRegisterButton();
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Out")));
    }

    @AfterTest
    public void logOut() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickLogOut();
    }
}