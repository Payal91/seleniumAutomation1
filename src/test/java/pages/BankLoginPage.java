package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankLoginPage {
    WebDriver driver;

    public BankLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.NAME, using = "username")
    WebElement userTextBox;
    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    WebElement passwordTextBox;
    @FindBy(how = How.CSS, using = "input[value='Log In']")
    WebElement logInButton;


    public void setEmail(String strEmail) {
        userTextBox.sendKeys(strEmail);
    }
    public void setPasswordTextBox(String strPswd) {
        passwordTextBox.sendKeys(strPswd);
    }
    public void clickOnLoginIn() {
        logInButton.click();
    }
}
